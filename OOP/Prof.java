package OOP;

public class Prof extends Persona {
    // creo attributo materia della classe Prof
    String subject;

    // costruttore
    Prof(String name, String lastName, int eta, String subject) {
        super(name, lastName, eta);
        this.subject = subject;
    }

    // metodo con override per sovrascrivere metodo superclasse
    @Override
    void saluta() {
        System.out.println(" Buongiorno ragazzi!");
    }

}
