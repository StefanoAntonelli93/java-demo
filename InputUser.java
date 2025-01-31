import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Piacere di conoscerti " + nome);

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hai " + eta + " anni.. e dove vivi?");
        String citta = scanner.nextLine();
        System.out.println("Quindi vivi a " + citta + ".. ora ho tutti i dati che mi occorrono, grazie " + nome);

    }
}
