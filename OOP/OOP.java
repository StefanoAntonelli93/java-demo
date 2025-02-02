package OOP;

public class OOP {
    public static void main(String[] args) {
        // creo oggetto persona1 aggiungo parametri al costruttore
        Persona persona1 = new Persona("Stefano", "Antonelli", 31, false);

        persona1.name = "Stefanino"; // modifico nome
        System.out.println(persona1.name + " ha " + persona1.eta + " anni");

        persona1.swim(); // invoco metodo

        // creo oggetto persona2
        Persona persona2 = new Persona("Gabriele", "Antonelli", 25, false);
        System.out.println(persona2.name);
    }
}
