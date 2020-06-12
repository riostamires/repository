package algoritmo;
import java.util.Scanner;

/* Este algoritmo recebe as 03 notas do aluno
   e retorna a média;
 */

public class Algoritmo4 {
    public static void runAlgoritmo4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe o nome do aluno: ");
        String aluno = scanner.next();


        System.out.println(nome + ", informe a primeira nota de " + aluno + " :");
            float n1 = scanner.nextFloat();
                while (n1 < 0) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n1 = scanner.nextFloat();}
                while (n1 > 10) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n1 = scanner.nextFloat();}
            System.out.println("Informe o peso da 1ª nota:");
            int p1 = scanner.nextInt();
                while (p1 <= 0) {
                    System.out.println("Peso inválido. Por favor, digite um peso maior que zero: ");
                    p1 = scanner.nextInt();}


        System.out.println(nome + ", informe a segunda nota de " + aluno + " :");
            float n2 = scanner.nextFloat();
                while (n2 < 0) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n2 = scanner.nextFloat();}
                while (n2 > 10) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n2 = scanner.nextFloat();}
            System.out.println("Informe o peso da 2ª nota:");
            int p2 = scanner.nextInt();
                while (p2 <= 0) {
                    System.out.println("Peso inválido. Por favor, digite um peso maior que zero: ");
                    p2 = scanner.nextInt();}

        System.out.println(nome + ", informe a terceira nota de " + aluno + " :");
            float n3 = scanner.nextFloat();
                while (n3 < 0) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n3 = scanner.nextFloat();}
                while (n3 > 10) {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre zero e dez: ");
                    n3 = scanner.nextFloat();}
            System.out.println("Informe o peso da 3ª nota:");
            int p3 = scanner.nextInt();
                while (p3 <= 0) {
                System.out.println("Peso inválido. Por favor, digite um peso maior que zero: ");
                p3 = scanner.nextInt();}

        float media = (((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3));

        System.out.println(nome + ", a média do aluno " + aluno + " é igual a: " + media + " .");

        if (media < 4){
            System.out.println("O aluno " + aluno + " está reprovado!"); }
        else if (media < 7) {
            System.out.println("O aluno " + aluno + " está em recuperação!");}
        else {
            System.out.println("O aluno " + aluno + " está aprovado!");
        }

    }

}
