package algoritmo;
public class Algoritmo9 {
// Este algoritmo mostra os números ímpares de 0 a 100;


    public static void runAlgoritmo9 (){
        int cont;
        for (cont = 0; cont <= 100; cont++) {
            if (cont % 2 == 1) {
                System.out.println(cont);
            }
        }
    }
}
