public class Create {
    public Create(String nome, String cpf) {
        Pessoa pessoa = new Pessoa(nome, cpf);
        Banco.cadastrar(pessoa);
    }
}
