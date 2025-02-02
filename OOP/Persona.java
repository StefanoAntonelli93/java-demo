package OOP;

// creo classe Persona
public class Persona {
    String name;
    String lastName;
    int eta;
    boolean isSingle;

    // COSTRUTTORE JAVA
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
}
