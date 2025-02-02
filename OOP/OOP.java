package OOP;

public class OOP {
    public static void main(String[] args) {
        // creo oggetto persona1 aggiungo parametri al costruttore
        Persona persona1 = new Persona("Stefano", "Antonelli", 31, false);
        persona1.name = "Stefanino"; // modifico nome
        System.out.println(persona1.name + " ha " + persona1.eta + " anni");
        persona1.swim(); // invoco metodo

        // creo oggetto persona2
        Persona persona2 = new Persona("Gabriele", "Antonelli", 25);
        System.out.println(persona2);

        // creo altri due oggetti persona
        Persona persona3 = new Persona("Sandro", "Milo", 47);
        Persona persona4 = new Persona("Valeroi", "Michels", 52);

        // ******ARRAY DI OGGETTI******* */

        Persona[] persone = { persona1, persona2, persona3, persona4 };

        // stampo oggetto persona in posizione 0
        System.out.println(persone[0]);

        // oggetto come parametro di un metodo
        persona3.message(persona4);
    }
}
