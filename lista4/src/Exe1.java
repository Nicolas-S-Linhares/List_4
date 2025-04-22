import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mes");

        int horasmes = scanner.nextInt();

        System.out.println("Entre com o valor pago por hora");

        int horasvalor = scanner.nextInt();

        int salarioTotal = horasmes * horasvalor;

        if (horasmes > 160 ) {

            int salarioExtra = (horasmes - 160) * (horasvalor/2);
            salarioTotal = salarioTotal + salarioExtra;

        }
        System.out.println("o salario total é :" +salarioTotal);


        scanner.close();   
    }
}

