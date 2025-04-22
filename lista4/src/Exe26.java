import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha uma opção:");
        System.out.println("T - Triângulo");
        System.out.println("Q - Quadrado");
        System.out.println("R - Retângulo");
        System.out.println("C - Círculo");

        System.out.print("opção: ");
        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.print("base:");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("altura:");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("area do Triângulo:" + areaTriangulo);
                break;

            case 'Q':
                System.out.print("Lado: ");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("Área do Quadrado: " + areaQuadrado);
                break;

            case 'R':
                System.out.print("base: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("altura: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("area do Retângulo: " + areaRetangulo);
                break;

            case 'C':
                System.out.print("raio: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * raioCirculo * raioCirculo;
                System.out.printf("area do Círculo: %.2f\n", areaCirculo);
                break;

            default:
                System.out.println("opção inválida!");
                break;
        }

        scanner.close();
    }
}
