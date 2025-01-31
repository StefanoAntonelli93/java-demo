public class Operations {
    public static void main(String[] args) {
        int x = 10;
        x += 10; // shorthand
        x++; // incremento di 1
        x--; // decremento di 1

        int y = 5;
        int sum = x + y;

        int module = x % y; // se resto è zero allora numero pari

        System.out.println(sum);
        System.out.println(module);

        // MATH
        System.out.println(Math.abs(-10)); // numero assoluto
        System.out.println(Math.min(55, 21)); // minimo
        System.out.println(Math.max(10, 30)); // massimo
        System.out.println(Math.pow(5, 3)); // potenza
        System.out.println(Math.sqrt(25)); // radice quadrata
    }

}
