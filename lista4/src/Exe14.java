import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dia: ");
        int dia = scanner.nextInt();

        System.out.print("mês: ");
        int mes = scanner.nextInt();

        System.out.print("ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = true;
        int diasNoMes;

        if (mes < 1 || mes > 12) {
            dataValida = false;
        } else {
            switch (mes) {
                case 2:
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                        diasNoMes = 29;
                    } else {
                        diasNoMes = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    diasNoMes = 30;
                    break;
                default:
                    diasNoMes = 31;
                    break;
            }

            if (dia < 1 || dia > diasNoMes) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("válida");
        } else {
            System.out.println("não válida");
        }

        scanner.close();
    }
}
