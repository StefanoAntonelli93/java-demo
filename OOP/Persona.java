package OOP;

// creo classe Persona
public class Persona {
    String name;
    String lastName;
    int eta;
    boolean isSingle;
    static int numeroPersone;
    // STATIC attributo uguale per ogni istanza
    // FINAL la variabile non può cambiare il suo valore, è allo stato finale

    // COSTRUTTORE
    Persona(String name, String lastName, int eta) {
        this.name = name;
        this.lastName = lastName;
        this.eta = eta;
        numeroPersone++;

    }

    // OVERLOADED COSTRUCTOR signature differenti
    Persona(String name, String lastName, int eta, boolean isSingle) {
        this.name = name;
        this.lastName = lastName;
        this.eta = eta;
        this.isSingle = isSingle;
    }

    // creo metodi per oggetto persona
    void saluta() {
        System.out.println(" Ciao!");
    }

    // toString() ritorna rappresentazione in stringa dell'oggetto
    @Override
    public String toString() {
        return this.name + " " + this.lastName + " " + this.eta;
    }

    // oggetto come parametro di un metodo
    void invioMessaggio(Persona destinatario) {
        System.out.println(this.name + " " + this.lastName + " invia un messaggio a: " + destinatario.name + " "
                + destinatario.lastName);
    }

    // metodo STATIC uguale per tutte le instanze
    static void mostraNumeroPersone() {
        System.out.println(numeroPersone);
    }
}
