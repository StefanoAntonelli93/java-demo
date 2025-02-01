/*
 * 
 * FUNZIONI metodo contenente delle operazioni che si può riutilizzare piu volte per alleggerire il codice 
 * 
 * 
 */

public class Functions {
    public static void main(String[] args) {
        somma(5, 6); // invoco funzione e assegno parametri
        somma(8, 6);
        somma(6, 6);
        somma(15, 6);
        int totaleSpeso = somma(5, 8);
        System.out.println("totale " + totaleSpeso);
    }

    static int somma(int a, int b) { // funzione
        int sum = a + b;
        System.out.println(sum);
        return sum; // ritorna il valore sum
    }
}
