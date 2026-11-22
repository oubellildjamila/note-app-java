// Calcule le résultat selon l'opérateur choisi
static double calculer(double a, double b, char op) {
    switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0) {
                throw new ArithmeticException("Division par zéro impossible");
            }
            return a / b;
        default:
            throw new IllegalArgumentException("Opérateur invalide : " + op);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String reponse;

    System.out.println("=== Calculatrice ===");

    do {
        System.out.print("Premier nombre : ");
        double a = sc.nextDouble();

        System.out.print("Opérateur (+, -, *, /) : ");
        char op = sc.next().charAt(0);

        System.out.print("Deuxième nombre : ");
        double b = sc.nextDouble();

        try {
            double resultat = calculer(a, b, op);
            System.out.println("Résultat : " + a + " " + op + " " + b + " = " + resultat);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.print("Faire un autre calcul ? (o/n) : ");
        reponse = sc.next();
    } while (reponse.equalsIgnoreCase("o"));

    System.out.println("Au revoir !");
    sc.close();
}
}
