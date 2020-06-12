package algoritmo;
import java.util.Scanner;

/*
Este Algoritmo recebe o custo de fábrica de um automóvel
e soma o custo do distribuidor e o custo dos impostos
para compor o valor total do veículo;
 */

public class Algoritmo5 {
    public static void runAlgoritmo5() {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Informe o custo de fábrica do automóvel: ");
    float custoFabrica = scanner.nextFloat();
        while (custoFabrica <= 0) {
            System.out.println("Valor inválido. Por favor, informe um custo maior que zero: ");
            custoFabrica = scanner.nextFloat(); }

    float distribuidor = (custoFabrica * 0.28f) ;
    float imposto = (custoFabrica * 0.45f);

    float valorTotal = (custoFabrica + distribuidor + imposto);

    System.out.println("O valor total do automóvel é R$ " + valorTotal + " Sendo R$ " + distribuidor +
            " equivalente ao distribuidor e R$ " + imposto + " equivalente aos impostos.");
    }
}
