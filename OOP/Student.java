package OOP;

public class Student extends Persona {

    // costruttore
    Student(String name, String lastName, int eta) {
        super(name, lastName, eta);
    }

    // metodo con override per sovrascrivere metodo superclasse
    @Override
    void saluta() {
        System.out.println(" Ciao Prof!");
    }

}
