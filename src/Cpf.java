public class Cpf {
    private String cpf = "";
    private String cpfSanitizado = "";

    public Cpf(String cpf) {
        this.cpf = cpf;
        this.cpfSanitizado = this.sanitizarCpf(cpf);

        if (tamanhoValido(cpf)) {
            System.out.println("A quantidade de dígitos informados para o CPF não está correta.");
        }

        if (validarCpf(cpf)) {
            System.out.println("CPF validado com sucesso.");
        } else {
            System.out.println("CPF inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String sanitizarCpf(String cpf) {
        return cpf.replaceAll("[^a-zA-Z0-9]", "");
    }

    public boolean tamanhoValido(String cpf) {
        return this.cpf.length() != 14 && this.cpfSanitizado.length() != 11;
    }

    public boolean validarCpf(String cpf) {

        // Algoritmo autoral desenvolvido com base no roteiro disponível em https://www.macoratti.net/alg_cpf.htm

        String novePrimeirosDigitos = "";
        int[] numerosDoCpfEmArray = new int[9];
        int[] arrayMultiplicado = new int[9];

        // Capturar apenas os nove primeiros dígitos do CPF informado
        novePrimeirosDigitos = cpfSanitizado.substring(0, 9);
        for (int i = novePrimeirosDigitos.length() - 1; i >= 0; i--) {
            int numero = Character.getNumericValue(novePrimeirosDigitos.charAt(i));
            numerosDoCpfEmArray[i] = numero;
        }

        // Cria uma cópia do primeiro array
        arrayMultiplicado = numerosDoCpfEmArray.clone();

        // Multiplicar o último dígito por 2, o penúltimo por 3, o antepeúltimo por 4
        // e assim sucessivamente
        int multiplicador = 2;
        for (int j = 8; j >= 0; j--) {
            arrayMultiplicado[j] *= multiplicador;
            multiplicador++;
        }

        // Somar cada dígito do array multiplicado
        int somaDigitosCpf = 0;
        for (int k = 0; k < 9; k++) {
            somaDigitosCpf += arrayMultiplicado[k];
        }

        // Calcular o primeiro DV
        int primeiroDV = 0;
        if ((somaDigitosCpf % 11) >= 2) {
            primeiroDV = 11 - (somaDigitosCpf % 11);
        } else {
            primeiroDV = 0;
        }

        // Criar um novo array com os nove primeiros dígitos
        // + o primeiro DV
        int[] numerosDoCpfEmArray2 = new int[10];
        for (int i = 0; i < 9; i++) {
            numerosDoCpfEmArray2[i] = numerosDoCpfEmArray[i];
        }
        numerosDoCpfEmArray2[9] = primeiroDV;
        
        // Refazer a multiplicação, agora incluindo o primeiro DV
        int[] arrayMultiplicado2 = new int[10];
        arrayMultiplicado2 = numerosDoCpfEmArray2.clone();
        
        multiplicador = 2;
        for (int j = 9; j >= 0; j--) {
            arrayMultiplicado2[j] *= multiplicador;
            multiplicador++;
        }

        // Somar cada dígito do novo array multiplicado
        somaDigitosCpf = 0;
        for (int k = 0; k < 10; k++) {
            somaDigitosCpf += arrayMultiplicado2[k];
        }

        // Calcular o segundo DV
        int segundoDV = 0;
        if ((somaDigitosCpf % 11) >= 2) {
            segundoDV = 11 - (somaDigitosCpf % 11);
        } else {
            segundoDV = 0;
        }

        // Criar um novo array para incluir o segundo DV
        int[] arrayCpfCompleto = new int[11];
        for (int i = 0; i < 10; i++) {
            arrayCpfCompleto[i] = numerosDoCpfEmArray2[i];
        }
        arrayCpfCompleto[10] = segundoDV;

        // Transformar o array contendo o CPF em String
        String cpfTestado = "";
        for (int i = 0; i < 11; i++) {
            cpfTestado = cpfTestado.concat(String.valueOf(arrayCpfCompleto[i]));
        }
        
        System.out.println(cpfSanitizado);
        System.out.println(cpfTestado);

        return (cpfSanitizado.compareTo(cpfTestado) == 0) ? true : false;
    }

    @Override
    public String toString() {
        return this.cpf;
    }
}
