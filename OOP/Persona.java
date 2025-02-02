package OOP;

// creo classe Persona
public class Persona {
    String name;
    String lastName;
    int eta;
    boolean isSingle;

    // COSTRUTTORE
    Persona(String name, String lastName, int eta) {
        this.name = name;
        this.lastName = lastName;
        this.eta = eta;

    }

    // OVERLOADED COSTRUCTOR
    Persona(String name, String lastName, int eta, boolean isSingle) {
        this.name = name;
        this.lastName = lastName;
        this.eta = eta;
        this.isSingle = isSingle;
    }

    // creo metodi per oggetto persona
    void swim() {
        System.out.println(name + " sta nuotando");
    }

    void fly() {
        System.out.println(name + " sta volando");
    }

    void run() {
        System.out.println(name + " sta correndo");
    }

    // toString() ritorna rappresentazione in stringa dell'oggetto
    @Override
    public String toString() {
        return this.name + " " + this.lastName + " " + this.eta;
    }

    // oggetto come parametro di un metodo

    void message(Persona destinatario) {
        System.out.println(this.name + " " + this.lastName + " invia un messaggio a: " + destinatario.name + " "
                + destinatario.lastName);
    }
}
