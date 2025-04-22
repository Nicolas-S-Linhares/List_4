import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da carta em gramas: ");
        int peso = scanner.nextInt();

        double custo = 0.45;

        if (peso > 50) {
            int excesso = peso - 50;
            int adicional = (int) Math.ceil(excesso / 20.0); 
            custo += adicional * 0.45;
        }

        System.out.printf("%.4f\n", custo); 

        scanner.close();
    }
}
