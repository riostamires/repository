package algoritmo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o número do algoritmo que você quer executar:");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Algoritmo1.runAlgoritmo1();
                break;

            case 2:
                Algoritmo2.runAlgoritmo2();
                break;

            case 4:
                Algoritmo4.runAlgoritmo4();
                break;

            case 5:
                Algoritmo5.runAlgoritmo5();
                break;

            case 6:
                Algoritmo6.runAlgoritmo6();
                break;

            case 7:
                Algoritmo7.runAlgoritmo7();
                break;

            case 9:
                Algoritmo9.runAlgoritmo9();
                break;

            case 11:
                Algoritmo11.runAlgoritmo11();
                break;
        }
    }
}