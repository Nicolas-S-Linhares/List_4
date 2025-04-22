import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite há quantos meses o funcionário foi admitido: ");
        int meses = scanner.nextInt();

        if (meses <= 12 && meses > 0) {
            System.out.println("o funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("o funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("reajuste não informado");
        }

        scanner.close();
    }
}
