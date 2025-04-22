import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("massa (em kg): ");
        double massa = scanner.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("magreza");
        } else if (imc < 25.0) {
            System.out.println("saudável");
        } else if (imc < 30.0) {
            System.out.println("sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("sbesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("obesidade Grau II (severa)");
        } else {
            System.out.println("obesidade Grau III (mórbida)");
        }

        scanner.close();
    }
}
