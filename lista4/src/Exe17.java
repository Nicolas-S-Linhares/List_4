import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("quantidade de dependentes: ");
        int dependentes = scanner.nextInt();

        double descontoDependentes = 0.02 * dependentes * rendaAnual;
        double rendaLiquida = rendaAnual - descontoDependentes;

        double imposto = 0.0;
        double percentualImposto = 0.0;

        if (rendaLiquida <= 2000.0) {
            System.out.println("o contribuinte não paga imposto.");
        } else if (rendaLiquida <= 5000.0) {
            percentualImposto = 5.0;
            imposto = rendaLiquida * 0.05;
            System.out.printf("o imposto é de %.0f%%: R$ %.2f\n", percentualImposto, imposto);
        } else if (rendaLiquida <= 10000.0) {
            percentualImposto = 10.0;
            imposto = rendaLiquida * 0.10;
            System.out.printf("o imposto é de %.0f%%: R$ %.2f\n", percentualImposto, imposto);
        } else {
            percentualImposto = 15.0;
            imposto = rendaLiquida * 0.15;
            System.out.printf("o imposto é de %.0f%%: R$ %.2f\n", percentualImposto, imposto);
        }

        scanner.close();
    }
}
