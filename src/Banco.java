import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Pessoa> dataBase = new ArrayList<>();
    private static int size = Pessoa.getTotalDePessoas();

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

    public static void remover(int id) {
        Banco.dataBase.remove(id - 1);
        Pessoa.setTotalPessoas(Pessoa.getTotalDePessoas() - 1);
    }

    public static int getSize() {
        return Banco.size;
    }

    public static boolean isEmpty() {
        return Banco.size == 0;
    }
}
