package Interface;

public class Zebra implements Preda { // sovrascrivo metodo interfaccia preda
    @Override
    public void run() {
        System.out.println("La zebra scappa");
    }
}
