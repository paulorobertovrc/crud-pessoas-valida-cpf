import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Pessoa> dataBase = new ArrayList<>();

    public void cadastrar(Pessoa pessoa) {
        Banco.dataBase.add(pessoa);
    }

    public List<Pessoa> buscar() {
        return Banco.dataBase;
    }

    public Pessoa buscar(int id) {
        return Banco.dataBase.get(id - 1);
    }

    public void remover(int id) {
        if (Banco.dataBase.get(id - 1).getId() == id) { 
            Banco.dataBase.remove(id);
        }
        Pessoa.setTotalPessoas(Pessoa.getTotalDePessoas() - 1);
    }
}
