package Interface;

public class Pesce implements Preda, Predatore {// sovrascrivo metodo interfaccia preda e predatore
    @Override
    public void run() {
        System.out.println("Il pesce piccolo scappa");
    }

    @Override
    public void hunt() {
        System.out.println("Il pesce grande caccia");
    }
}
