import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número maior que 0:");
        String entrada = scanner.nextLine();

        try {
            double numero = Double.parseDouble(entrada);

            if (numero <= 0) {
                System.out.println("O número deve ser maior que 0.");
            } else if (entrada.contains(".")) {
                String[] partes = entrada.split("\\.");
                if (partes.length > 1 && Integer.parseInt(partes[1]) > 0) {
                    System.out.println("Casas decimais foram digitadas");
                } else {
                    System.out.println("Casas decimais não foram digitadas");
                }
            } else {
                System.out.println("Casas decimais não foram digitadas");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida");
        }

        scanner.close();
    }
}
