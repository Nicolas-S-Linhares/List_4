import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior que 0");

        int valor = scanner.nextInt();

        if (valor % 2 ==0 ) {
            System.out.println("Numero é par");
        }else{
            System.out.println("numero é impar");
        }

        scanner.close();   
    }
}
