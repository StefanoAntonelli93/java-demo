import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Piacere di conoscerti " + nome);

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt(); // int non crea nuova riga
        scanner.nextLine();

        System.out.println("Hai " + eta + " anni.. e dove vivi?");
        String citta = scanner.nextLine();
        System.out.println("Quindi vivi a " + citta + ".. ora ho tutti i dati che mi occorrono, grazie " + nome);

        try { // TRY CATCH PER GESTIONE ECCEZIONI
            System.out.println("Scrivi il primo numero");
            int x = scanner.nextInt();

            System.out.println("Scrivi il secondo numero");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("risultato divisione: " + result);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("non puoi dividere per zero");
        }

        scanner.close(); // Chiudo Scanner per evitare il warning
    }
}
