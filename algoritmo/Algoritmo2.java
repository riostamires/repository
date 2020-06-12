package algoritmo;
import java.util.Scanner;

/* Este algoritmo recebe três números positivos e realiza a seguinte operação:
   ((n1 + n2) / (n3 * n2 * n1))
   Sendo n1 > 0 e n1 !=1
         n2 > 0 e n2 !=2
         10 < n3 < 15
 */

public class Algoritmo2 {
    public static void runAlgoritmo2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();


        System.out.println(nome + ", informe o primeiro número: ");
        float n1 = scanner.nextFloat();
            while (n1 <= 0) {
                System.out.println("Número inválido. Por favor, digite um número maior que zero: ");
                n1 = scanner.nextFloat();}
            while (n1 == 1) {
            System.out.println("Número inválido. Por favor, digite um número diferente de um: ");
            n1 = scanner.nextFloat();}

        System.out.println(nome + ", informe o segundo número: ");
        float n2 = scanner.nextFloat();
            while (n2 <= 0) {
                System.out.println("Número inválido. Por favor, digite um número maior que zero: ");
                n2 = scanner.nextFloat();}
            while (n2 == 2) {
                System.out.println("Número inválido. Por favor, digite um número diferente de dois: ");
                n2 = scanner.nextFloat();}

        System.out.println(nome + ", informe o terceiro número: ");
        float n3 = scanner.nextFloat();
            while (n3 < 10) {
                System.out.println("Número inválido. Por favor, digite um número entre dez e quinze: ");
                n3 = scanner.nextFloat();}
            while (n3 > 15) {
                System.out.println("Número inválido. Por favor, digite um número entre dez e quinze: ");
                n3 = scanner.nextFloat();}

        float resultado = ((n1 + n2) / (n3 * n2 * n1));

        System.out.println(nome + ", o resultado da sua operação é : " + resultado + " .");
    }
}