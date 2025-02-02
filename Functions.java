/*
 * 
 * FUNZIONI metodo contenente delle operazioni che si può riutilizzare piu volte per alleggerire il codice 
 * 
 * 
 */

public class Functions {
    public static void main(String[] args) {
        somma(5, 6); // invoco funzione e assegno parametri

        int totaleSpeso = somma(5, 8);
        System.out.println("totale " + totaleSpeso);

        int nuovoTotaleSpeso = somma(5, 8, 13);
        System.out.println("nuovo totale " + nuovoTotaleSpeso);
    }

    static int somma(int a, int b) { // funzione
        int sum = a + b;
        return sum; // ritorna il valore sum
    }

    /************ OVERLOADED METHODS ************** */

    static int somma(int a, int b, int c) { // funzione con stesso nome ma cambiano i parametri o il tipo di dati
                                            // (signature diverse)
        int sum = a + b + c;
        return sum; // ritorna il valore sum
    }

}
