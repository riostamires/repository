package algoritmo;
import java.util.Scanner;

//Este algoritmo informa, dentre 03 números, qual é o maior;

public class Algoritmo7 {
    public static void runAlgoritmo7 () {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    float n1 = scanner.nextFloat();

    System.out.println("Informe o segundo número:");
    float n2 = scanner.nextFloat();

    System.out.println("Informe o terceiro número:");
    float n3 = scanner.nextFloat();

    if (n1 > n2 && n1 > n3) {
        System.out.println("O maior número é: " + n1 + " ."); }
    else if (n1 <=n2 && n2 < n3) {
        System.out.println("O maior número é: " + n3 + " ."); }
    else if (n2 > n3 && n2 < n1) {
        System.out.println("O maior número é: " + n2 + " ."); }
        else {
            System.out.println("Os números informados são iguais."); }


    }
}
