import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Pessoa> dataBase = new ArrayList<>();
    private int size = Pessoa.getTotalDePessoas();

    public static void cadastrar(Pessoa pessoa) {
        Banco.dataBase.add(pessoa);
    }

    // Retorna todas as Pessoas cadastradas
    public static List<Pessoa> buscar() {
        return Banco.dataBase;
    }

    // Retorna a Pessoa cujo ID é passado por parâmetro
    public static Pessoa buscar(int id) {
        return Banco.dataBase.get(id - 1);
    }

    public void remover(int id) {
        if (Banco.dataBase.get(id - 1).getId() == id) { 
            Banco.dataBase.remove(id);
        }
        Pessoa.setTotalPessoas(Pessoa.getTotalDePessoas() - 1);
    }

    public int getSize() {
        return this.size;
    }
}
