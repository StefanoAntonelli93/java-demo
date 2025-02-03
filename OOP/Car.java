package OOP;

public class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("la macchina si muove");
    };

    @Override
    void stop() {
        System.out.println("la macchina si ferma");
    };
}
