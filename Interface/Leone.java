package Interface;

public class Leone implements Predatore { // sovrascrivo metodo interfaccia predatore
    @Override
    public void hunt() {
        System.out.println("Il leone caccia");
    }
}
