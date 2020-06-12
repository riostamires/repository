package algoritmo;

// Este algoritmo conta quantos números maiores que 100 são mostrados;

public class Algoritmo11 {
    public static void runAlgoritmo11() {

        int total = 0;
        int cont;

        for (cont = 0; cont <= 500; cont++) {
            if (cont > 200) {
                total = total + 1;
            }
        }
        System.out.println("Existem " + total + " números maiores que 200.");
    }
}
