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

        int[] numbers = { 10, 20, 30, 40, 50 }; // array

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

        /********** ARRAY 2D MULTIDIMENSIONALI **************/
        // String[][] classi = new String[3][5]; // 3 classi 5 studenti

        String[][] teams = {
                { "Hulk", "IronMan" },
                { "Superman", "Loki" },
                { "Batman", "Spiderman" },
        };
        System.err.println(teams[0][1]); // stampo Ironman

        for (int team = 0; team < teams.length; team++) {
            System.out.println();
            for (int hero = 0; hero < teams[team].length; hero++) {
                System.out.println(teams[team][hero]); // in javascipt teams.team.hero
            }
        }

        for (String[] team : teams) {
            System.out.println();
            for (String hero : team) {
                System.out.println(hero);
            }
        }
    }
}
