import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Criamos um objeto input da classe Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}