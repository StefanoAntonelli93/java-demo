/*
 * 
 * ARRAY -> collezione di dati
 * 
 * 
 */

public class Array {
    public static void main(String[] args) {

        // int[] numbers = new int[3];

        // a differenza di javascript arraylist gli array
        // di java hanno dimensione fissa
        // // non puoi aggiungere elementi

        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;

        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println(numbers[2]);

        numbers[2] = 33; // modifico valore elemento

        System.out.println(numbers[2]);
        System.out.println("lunghezza array: " + numbers.length); // stampo lunghezza array
        System.out.println(numbers[numbers.length - 1]); // prendo ultimo elemento dell'array

        for (int i = 0; i < numbers.length; i++) { // ciclo for
            System.out.println(numbers[i]);
        }

        System.out.println("\n-----------------------------\n");

        for (int number : numbers) { // Ciclo foreach
            System.out.println(number);
        }

    }
}
