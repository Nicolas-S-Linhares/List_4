import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("idade do primeiro homem: ");
        int homem1 = scanner.nextInt();
        System.out.print("idade do segundo homem: ");
        int homem2 = scanner.nextInt();

        System.out.print("idade da primeira mulher: ");
        int mulher1 = scanner.nextInt();
        System.out.print("idade da segunda mulher: ");
        int mulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);

        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("soma: " + soma);
        System.out.println("produto: " + produto);

        scanner.close();
    }
}