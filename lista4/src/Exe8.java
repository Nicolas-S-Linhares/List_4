import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a letra");

        char letra = scanner.next().toUpperCase().charAt(0);

        if(letra == 'A' || letra == 'E' ||letra == 'I' ||letra == 'o' ||letra == 'U'){
            System.out.println("É uma vogal");
        }else{
            System.out.println("Não é uma vogal");
        }

        scanner.close();
}
}
