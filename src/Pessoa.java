public class Pessoa {
    // atributo estático para controlar o total de pessoas cadastradas
    private static int totalDePessoas = 0;
    
    private String nome;
    private Cpf cpf;
    // identificador único de cada pessoa
    private int id;
        
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = new Cpf(cpf);
        totalDePessoas++;
        this.id = totalDePessoas;
    }

    // Retorna o total de pessoas cadastradas
    public static int getTotalDePessoas() {
        return totalDePessoas;
    }

    // Este setter foi criado para permitir a redução do total de cadastros após a exclusão de uma pessoa do banco
    // Os métodos de manipulação do banco estão na classe Banco
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
        return "ID: " + this.id +  " | Nome: " + this.nome + " | CPF: " + this.cpf;
    }
}
