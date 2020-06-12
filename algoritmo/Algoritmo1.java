package algoritmo;
import java.util.Scanner;

//Este algoritmo recebe três números positivos e realiza a seguinte operação: ((n1 + n2) / (n3 * n2 * n1))

public class Algoritmo1 {
    public static void runAlgoritmo1 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();


        System.out.println(nome + ", informe o primeiro número: ");
        float n1 = scanner.nextFloat();
            while (n1<=0) {
                System.out.println("Número inválido. Por favor, informe um número maior que zero: ");
                n1 = scanner.nextFloat();
            }

        System.out.println(nome + ", informe o segundo número: ");
        float n2 = scanner.nextFloat();
            while (n2<=0) {
                System.out.println("Número inválido. Por favor, informe um número maior que zero: ");
                n2 = scanner.nextFloat();
            }

        System.out.println(nome + ", informe o terceiro número: ");
        float n3 = scanner.nextFloat();
            while (n3<=0) {
                System.out.println("Número inválido. Por favor, informe um número maior que zero: ");
                n3 = scanner.nextFloat();
            }

        float resultado = ((n1+n2)/(n3*n2*n1));

        System.out.println(nome + ", o resultado da sua operação é : " + resultado + " .");
    }
}
