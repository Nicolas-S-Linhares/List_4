import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o lado 1:");
        int lado1 = scanner.nextInt();

        System.out.print("digite o lado 2:");
        int lado2 = scanner.nextInt();

        System.out.print("digite o lado 3:");
        int lado3 = scanner.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("não formam um triangulo");
        }

        scanner.close();
    }
}
