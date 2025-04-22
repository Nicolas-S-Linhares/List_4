import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hora de chegada: ");
        int horaChegada = scanner.nextInt();
        System.out.print("Minuto de chegada: ");
        int minChegada = scanner.nextInt();
        System.out.print("Hora de saída: ");
        int horaSaida = scanner.nextInt();
        System.out.print("Minuto de saída: ");
        int minSaida = scanner.nextInt();
        

        if (horaChegada < 0 || horaChegada >= 24 || horaSaida < 0 || horaSaida >= 24 ||
            minChegada < 0 || minChegada >= 60 || minSaida < 0 || minSaida >= 60) {
            System.out.println("Dados inválidos!");
            return;
        }

        int totalMinutosChegada = horaChegada * 60 + minChegada;
        int totalMinutosSaida = horaSaida * 60 + minSaida;

        if (totalMinutosSaida < totalMinutosChegada) {
            totalMinutosSaida += 24 * 60;
        }

        int tempoEstacionadoMinutos = totalMinutosSaida - totalMinutosChegada;

        int horasEstacionadas = (int) Math.ceil(tempoEstacionadoMinutos / 60.0);

        if (tempoEstacionadoMinutos <= 30) {
            horasEstacionadas = 1;
        }

        System.out.println("Tempo estacionado: " + horasEstacionadas + " hora(s)");

        double preco = 0.0;
        if (horasEstacionadas == 1) {
            preco = 5.00;
        } else if (horasEstacionadas == 2) {
            preco = 10.00;
        } else if (horasEstacionadas == 3 || horasEstacionadas == 4) {
            preco = 15.00;
        } else {
            preco = 15.00 + (horasEstacionadas - 4) * 10.00;
        }

        System.out.printf("Preço cobrado = R$%.2f\n", preco);

        scanner.close();
    }
}
