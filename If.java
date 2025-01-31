public abstract class If {
    public static void main(String[] args) {

        boolean isOnline = false;
        if (isOnline) {
            System.out.println("L'utente è online.");
        } else {
            System.out.println("L'utente è offline.");
        }

        String name = "Marco";
        int eta = 20;
        if (name == "Luca" && eta == 30) {
            System.out.println("è Luca");
        } else if (name == "Marco" && eta == 30) {
            System.out.println("è Marco");
        } else if (name == "Giorgio") {
            System.out.println("è Giorgio");
        } else if (name == "Gianni") {
            System.out.println("è Gianni");
        } else {
            System.out.println("è un altro");
        }

        // IF annidato
        if (eta <= 20) {
            if (eta < 18) {
                System.out.println("è minorenne");
            } else {
                System.out.println("è maggiorenne");
            }
            System.out.println("può entrare");
        }

        // OPERATORE TERNARIO
        String x = 20 < 18 ? "si è minore di 18" : "non è minore di 18";
        System.out.println(x);

        // SWITCH piu breve degli if se ci sono troppe condizioni
        String nome = "Aldo";
        switch (nome) {
            case "Anna":
                System.out.println("ciao Anna");
                break;
            case "Ambra":
                System.out.println("ciao Anna");
                break;
            case "Paolo":
                System.out.println("ciao Anna");
                break;
            case "Aldo":
                System.out.println("ciao Aldo");
                break;
            case "Susanno":
                System.out.println("ciao Susanno");
                break;
            case "Ester":
                System.out.println("ciao Ester");
                break;
            default:
                System.out.println("ciao a tutti");
        }

    }

}
