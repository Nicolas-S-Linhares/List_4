import java.util.Scanner;

public class Exe9 {
    public static boolean verificarMultiplo(int a, int b) {
        return (a % b == 0 || b % a == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        if (valor1/valor2 == 0) {
            System.out.println("Os numeros são multiplos");
        } else {
            System.out.println("Os numeros não são multiplos");
        }

        scanner.close();
}
}
