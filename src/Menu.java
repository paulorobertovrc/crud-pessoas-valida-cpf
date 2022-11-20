import java.io.IOException;
import java.util.Scanner;

public class Menu {
    
    public static void imprimirMenu() {
        System.out.println("============== MENU PRINCIPAL ==============");
        System.out.println("[ 1 ] CADASTRAR");
        System.out.println("[ 2 ] BUSCAR");
        System.out.println("[ 3 ] ATUALIZAR");
        System.out.println("[ 4 ] EXCLUIR");
        System.out.println("[ 5 ] SAIR");
        System.out.println("Selecione a opção desejada:");
        System.out.print("> ");
        
        Scanner sc = new Scanner(System.in);
        int opcaoSelecionada = sc.nextInt();
        switch (opcaoSelecionada) {
            case 1:
                System.out.println("op 1");
                break;
            case 2:
                System.out.println("op 2");
                break;
            case 3:
                System.out.println("op 3");
                break;
            case 4:
                System.out.println("op 4");
                break;
            case 5:
                System.out.println("op 5");
                break;
        
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        // sc.close();

        System.out.println(opcaoSelecionada);
    }

    public static void apagarConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
