import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o numero do curso (1 – ciencia da computaçoo, 2 – iicenciatura da computação, 3 – sistemas de informação):");
        int curso = scanner.nextInt();

        switch (curso) {
            case 1:
                System.out.println("bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("licenciado em Computação");
                break;
            case 3:
                System.out.println("bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("opção inválida! Por favor, escolha entre 1, 2 ou 3");
                break;
        }

        scanner.close();
    }
}

