public class Read {
    Read() {
        System.out.println(Banco.buscar());
    }

    Read(int id) {
        System.out.println(Banco.buscar(id));
    }
}
