public class App {
    public static void main(String[] args) throws Exception {
        String cpf = "";
        String cpfSomenteNumeros = "";
        String novePrimeirosDigitosCpf = "";
        int primeiroDigito;
        int calculoPrimeiroDigito;
        int segundoDigito;
        int calculoSegundoDigito;

        int cpfSomado = 0;
        int[] numArray = new int[9];
        int[] arrayMult = new int[9];
        int[] arrayMultFinal = new int[9];
        
        cpf = "111.444.777-35";
        cpfSomenteNumeros = cpf.replaceAll("[^a-zA-Z0-9]", "");
        novePrimeirosDigitosCpf = cpfSomenteNumeros.substring(0, 9);
        
        for (int i = novePrimeirosDigitosCpf.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(novePrimeirosDigitosCpf.charAt(i));
            numArray[i] = num;            
        }

        arrayMult = numArray.clone();

        int multiplicador = 2;
        for (int j = 8; j >= 0; j--) {
            arrayMult[j] *= multiplicador;
            multiplicador++;
        }

        for (int k = 0; k < 9; k++) {
            cpfSomado += arrayMult[k];
        }

        if ((cpfSomado % 11) >= 2) {
            primeiroDigito = 11 - (cpfSomado % 11);
        } else {
            primeiroDigito = 0;
        }

        int[] numArray2 = new int[10];
        
        for (int i = 0; i < 9; i++) {
            numArray2[i] = numArray[i];
        }
        numArray2[9] = primeiroDigito;
        
        int[] arrayMult2 = new int[10];
        arrayMult2 = numArray2.clone();
        
        multiplicador = 2;
        for (int j = 9; j >= 0; j--) {
            arrayMult2[j] *= multiplicador;
            multiplicador++;
        }

        cpfSomado = 0;
        for (int k = 0; k < 10; k++) {
            cpfSomado += arrayMult2[k];
        }

        if ((cpfSomado % 11) >= 2) {
            segundoDigito = 11 - (cpfSomado % 11);
        } else {
            segundoDigito = 0;
        }

        int[] arrayCpfTestadoFinal = new int[11];
        for (int i = 0; i < 10; i++) {
            arrayCpfTestadoFinal[i] = numArray2[i];
        }
        arrayCpfTestadoFinal[10] = segundoDigito;

        String cpfTestadoString = "";
        for (int i = 0; i < 11; i++) {
            cpfTestadoString = cpfTestadoString.concat(String.valueOf(arrayCpfTestadoFinal[i]));
        }

        System.out.println(cpfSomenteNumeros);
        System.out.println(cpfTestadoString);
        System.out.println(cpfSomenteNumeros.compareTo(cpfTestadoString));

        // https://www.macoratti.net/alg_cpf.htm
    }
}
