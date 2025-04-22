import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dia do vencimento:");
        int diaVencimento = scanner.nextInt();

        System.out.print("dia do pagamento:");
        int diaPagamento = scanner.nextInt();

        System.out.print("valor da prestação:");
        double valorPrestacao = scanner.nextDouble();

        double valorFinal = valorPrestacao;
        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.90;
            System.out.printf("o pagamento está em dia. O valor da prestação = R$%.2f\n", valorFinal);
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            if (diasAtraso <= 5) {
                System.out.println("o pagamento está atrasado. Perdeu o desconto");
                System.out.printf("o valor da prestação = R$%.2f\n", valorPrestacao);
            } else {
                double multa = 0.02 * diasAtraso * valorPrestacao;
                valorFinal = valorPrestacao + multa;
                System.out.printf("o pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$%.2f\n", valorFinal);
            }
        }

        scanner.close();
    }
}