/*
 * CICLO WHILE- DO WHILE
 * CICLO FOR
 * 
 * 
 */

public abstract class Iteration {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println("while -> " + i); // controlla condizione e se è true esegue operazione
            i++;
        }

        do {
            System.out.println("do while -> " + i); // esegue opeerazione e poi controlla condizione
            i++;
        } while (i < 0);

        // FOR nidificato
        for (int j = 0; j < 5; j++) {
            System.out.println("padre: " + j);
            for (int k = 0; k < 5; k++) {
                System.out.println("figlio: " + k);
            }
        }

        // FOR EACH
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int number : numbers) {
            if (number == 8) {
                break;
            }
            if (number == 2) {
                continue;
            }
            System.out.println(number);
        }

    }
}
