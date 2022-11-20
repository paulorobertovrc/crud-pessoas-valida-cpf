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

        Cpf cpf = new Cpf("111.444.777-35");

    }
}
