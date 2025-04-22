import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("idade de Marquinhos:");
        int marquinhos = scanner.nextInt();

        System.out.print("idade de Zezinho:");
        int zezinho = scanner.nextInt();

        System.out.print("idade de Luluzinha:");
        int luluzinha = scanner.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("o Marquinhos é o caçula");
        } else if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("o Zezee é o caçula");
        } else {
            System.out.println("a Luluzinha é a caçula");
        }

        scanner.close();
    }
}
