import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static boolean continuar = true;

    public static void main(String[] args) {
        while (continuar == true) {
            Menu.apagarConsole();
            Menu.imprimirMenu();
        }

        System.out.println();
        System.out.println("PROGRAMA ENCERRADO");
        System.out.println();
        sc.close();
    }

    public static Scanner getScanner() {
        return Main.sc;
    }

    public static void finalizar() {
        Main.continuar = false;
    }
}
