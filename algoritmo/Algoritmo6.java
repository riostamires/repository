package algoritmo;
import java.util.Scanner;

// Este Algoritmo recebe a idade do nadador e retorna a categoria a qual está inserido;

public class Algoritmo6 {
    public static void runAlgoritmo6 () {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, informe a idade do nadador:");
    int idade = scanner.nextInt();
        while (idade < 5) {
            System.out.println("Idade inválida. Informe uma idade maior ou igual a 5 anos:");
            idade = scanner.nextInt(); }

        if (idade >= 5 && idade <=7) {
            System.out.println("O nadador está na categoria Infantil A.");}
        else if (idade > 7 && idade <=10) {
            System.out.println("O nadador está na categoria Infantil B.");}
        else if (idade > 10 && idade <=13) {
            System.out.println("O nadador está na categoria Juvenil A.");}
        else if (idade > 13 && idade <=17) {
            System.out.println("O nadador está na categoria Juvenil B.");}
        else if (idade > 17) {
            System.out.println("O nadador está na categoria Adulto.");}

    }
}
