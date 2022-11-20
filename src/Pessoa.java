public class Pessoa {
    private static int id = 0;
    private String nome;
    private Cpf cpf;
    private String sequencia;
        
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = new Cpf(cpf);
        id++;
        this.sequencia = String.valueOf(id);
    }

    public static int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public String getSequencia() {
        return sequencia;
    }    
}
