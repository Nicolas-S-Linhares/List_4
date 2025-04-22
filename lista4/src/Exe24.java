import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.print("valor 2: ");
        int valor2 = scanner.nextInt();
        System.out.print("valor 3: ");
        int valor3 = scanner.nextInt();


        System.out.print("opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 <= valor2 && valor1 <= valor3) {
                    if (valor2 <= valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    } else {
                        System.out.println(valor1 + " " + valor3 + " " + valor2);
                    }
                } else if (valor2 <= valor1 && valor2 <= valor3) {
                    if (valor1 <= valor3) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor2 + " " + valor3 + " " + valor1);
                    }
                } else {
                    if (valor1 <= valor2) {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    } else {
                        System.out.println(valor3 + " " + valor2 + " " + valor1);
                    }
                }
                break;
            case 2:
                if (valor1 >= valor2 && valor1 >= valor3) {
                    if (valor2 >= valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    } else {
                        System.out.println(valor1 + " " + valor3 + " " + valor2);
                    }
                } else if (valor2 >= valor1 && valor2 >= valor3) {
                    if (valor1 >= valor3) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor2 + " " + valor3 + " " + valor1);
                    }
                } else {
                    if (valor1 >= valor2) {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    } else {
                        System.out.println(valor3 + " " + valor2 + " " + valor1);
                    }
                }
                break;
            case 3:
                int maior = Math.max(valor1, Math.max(valor2, valor3));
                int menor = Math.min(valor1, Math.min(valor2, valor3));
                int meio = valor1 + valor2 + valor3 - maior - menor;
                System.out.println(menor + " " + maior + " " + meio);
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }

        scanner.close();
    }
}
