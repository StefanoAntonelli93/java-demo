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
            FileWriter writer = new FileWriter("utility.txt");// se non trova file lo crea
            writer.write("Utility"); // scrivi nel file
            writer.append(
                    "\nSDKMAN! (Software Development Kit Manager) è un gestore di versioni per strumenti e SDK legati allo sviluppo in Java. Ti permette di installare, aggiornare e gestire diverse versioni di JDK, Maven, Gradle, Spring Boot e altri strumenti con semplici comandi.\r\n"
                            + //
                            "Perché usare SDKMAN?\r\n" + //
                            "\r\n" + //
                            "✅ Installa e aggiorna facilmente strumenti Java\r\n" + //
                            "✅ Passa rapidamente tra diverse versioni di JDK o altri SDK\r\n" + //
                            "✅ Funziona su Windows, macOS e Linux"); // agginugo seconda riga
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
