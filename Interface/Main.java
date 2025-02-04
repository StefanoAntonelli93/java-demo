package Interface;

public class Main {
    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        zebra.run();

        Leone leone = new Leone();
        leone.hunt();

        Pesce squalo = new Pesce();
        squalo.hunt();
        Pesce sardina = new Pesce();
        sardina.run();
    }

}
