import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");

        System.out.print("valor 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("valor 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:

                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                } else {
                    System.out.println("erro! O denominador não pode ser zero.");
                }
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }

        scanner.close();
    }
}
