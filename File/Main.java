package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // cercare un file
        File file = new File("C:\\Users\\stean\\Desktop\\fantacalcio.txt");
        if (file.exists()) {
            System.out.println("il file esiste");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            // file.delete();
        } else {
            System.out.println("file non trovato");
        }

        // creare un file
        try {
            FileWriter writer = new FileWriter("prova.txt");// se non trova file lo crea
            writer.write("Prima riga del file Prova.txt"); // scrivi nel file
            writer.append("\nSeconda riga"); // agginugo seconda riga
            writer.append("\nterza riga");
            writer.append("\nquarta riga");
            writer.append(" -> aggiungo qualcosa alla quarta riga");
            writer.close(); // chiudi file
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // DATE
        LocalDate x = LocalDate.now();
        System.out.println(x);
        // formattare data
        DateTimeFormatter y = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println(x.format(y));

    }
}
