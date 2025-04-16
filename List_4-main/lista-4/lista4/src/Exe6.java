import java.util.Scanner;

public class Exe6 {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe M, F ou I: ");
        String resposta = leitor.next();
        resposta = resposta.toUpperCase(); 
        char sexo = resposta.charAt(0); 


        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Valor inválido");
        }
        leitor.close();
    }
}