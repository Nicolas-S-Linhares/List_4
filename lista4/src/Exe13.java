import java.util.Scanner;

public class Exe13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a primeira carta:");
        int carta1 = scanner.nextInt();

        System.out.print("digite a segunda carta:");
        int carta2 = scanner.nextInt();

        System.out.print("digite a terceira carta:");
        int carta3 = scanner.nextInt();

        int boas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) boas++;
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) boas++;
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) boas++;

        if (boas == 1) {
            System.out.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        }

        scanner.close();
    }
}
