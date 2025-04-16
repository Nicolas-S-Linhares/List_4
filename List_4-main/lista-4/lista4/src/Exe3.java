import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul? (True/False): ");

        boolean corAzul = scanner.nextBoolean();

        if(corAzul){
            System.out.println("sim");
        }else{
            System.out.println("nao");
        }

        scanner.close();
}
}
