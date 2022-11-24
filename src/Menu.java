import java.io.IOException;
import java.util.Scanner;

public class Menu {

    // static boolean continuar = true;

    public static void imprimirMenu() {
        // apagarConsole();
        System.out.println("============== MENU PRINCIPAL ==============");
        System.out.println("[ 1 ] CADASTRAR");
        System.out.println("[ 2 ] BUSCAR");
        System.out.println("[ 3 ] ATUALIZAR");
        System.out.println("[ 4 ] EXCLUIR");
        System.out.println("[ 5 ] SAIR");
        System.out.print("Selecione a opção desejada: ");
        
        Scanner sc = Main.getScanner().useDelimiter("\n");
        int opcaoSelecionada = sc.nextInt();
        switch (opcaoSelecionada) {
            case 1:
                apagarConsole();
                System.out.println("============== CADASTRAR PESSOA ==============");
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("CPF: ");
                String cpf = sc.next();
                System.out.println();
                new Create(nome, cpf);
                System.out.println(nome + " cadastrado(a) com sucesso.");
                System.out.println();
                System.out.println("Total de pessoas cadastradas: " + Pessoa.getTotalDePessoas());
                prosseguir();
                break;
            case 2:
                apagarConsole();
                System.out.println("============== BUSCAR PESSOA ==============");
                System.out.print("Informe o ID do cadastro para busca [informe 0 para listar todos]: ");
                int respostaCase2 = sc.nextInt();
                System.out.println();
                
                if (respostaCase2 == 0) {
                    new Read();
                } else {
                    new Read(respostaCase2);
                }

                System.out.println();
                prosseguir();
                break;
            case 3:
                apagarConsole();
                System.out.println("============== ATUALIZAR PESSOA ==============");
                System.out.print("Informe o ID do cadastro a ser atualizado: ");
                int respostaCase3 = sc.nextInt();
                System.out.print("Informe o novo nome: ");
                String novoNome = sc.next();
                new Update(respostaCase3, novoNome);
                System.out.println();
                System.out.println(Banco.buscar(respostaCase3));
                System.out.println();
                prosseguir();
                break;
            case 4:
                apagarConsole();
                System.out.println("============== EXCLUIR PESSOA ==============");
                System.out.print("Informe o ID do cadastro a ser excluído: ");
                int respostaCase4 = sc.nextInt();
                new Delete(respostaCase4);
                System.out.println();
                System.out.println("Cadastro ID " + respostaCase4 + " excluído com sucesso.");
                System.out.println("Total de pessoas cadastradas: " + Pessoa.getTotalDePessoas());
                System.out.println();
                prosseguir();
                break;
            case 5:
                Main.finalizar();
                break;
        
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
                imprimirMenu();
        }
    }

    private static void prosseguir() {
        try {
            System.out.println();
            System.out.print("Pressione [ENTER] para prosseguir ... ");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
