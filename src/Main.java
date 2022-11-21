import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
        boolean cont = true;
        while(cont) {
            Menu.imprimirMenu();
            
            Scanner sc = new Scanner(System.in);
            System.out.print("> ");
            String numeroInformado = sc.nextLine();
            Cpf cpf = new Cpf(numeroInformado);
            while(cpf.tamanhoValido(numeroInformado)) {
                System.out.println("erro");
                System.out.print("> ");
                numeroInformado = sc.nextLine();
                cpf = new Cpf(numeroInformado);
            }
            sc.close();

            if (cpf.length() < 11 || cpf.length() > 14) {
                System.out.println("Invalid value in field CPF. Please try again.");
            }
            
            
            
            
            // cont = false;
            
        }*/

        Banco db = new Banco();
        Pessoa p1 = new Pessoa("Roberto", "111.444.777-35");
        Pessoa p2 = new Pessoa("Paulo", "111.444.777-35");
        Pessoa p3 = new Pessoa("Adriana", "111.444.777-35");
        Pessoa p4 = new Pessoa("Renata", "111.444.777-35");
        Pessoa p5 = new Pessoa("Jean", "111.444.777-35");
        db.cadastrar(p1);
        db.cadastrar(p2);
        db.cadastrar(p3);
        db.cadastrar(p4);
        db.cadastrar(p5);
        System.out.println(db.buscar());
        System.out.println("Total de pessoas cadastradas: " + Pessoa.getTotalDePessoas());
        db.remover(1);
        System.out.println(db.buscar());
        System.out.println("Total de pessoas cadastradas após remoção: " + Pessoa.getTotalDePessoas());

    }
}
