public class Read {
    Read() {
        System.out.println(Banco.buscar());
    }

    Read(int id) {
        Banco.buscar(id);
    }
}
