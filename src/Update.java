
public class Update {
    Update(int id, String nome) {
        Pessoa p = Banco.buscar(id);
        p.setNome(nome);
    }
}
