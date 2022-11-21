public class Pessoa {
    private static int totalDePessoas = 0;
    
    private String nome;
    private Cpf cpf;
    private int id;
        
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = new Cpf(cpf);
        totalDePessoas++;
        this.id = totalDePessoas;
    }

    public static int getTotalDePessoas() {
        return totalDePessoas;
    }

    public static void setTotalPessoas(int numero) {
        Pessoa.totalDePessoas = numero;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id +  "| Nome: " + this.nome + " | CPF: " + this.cpf;
    }
}
