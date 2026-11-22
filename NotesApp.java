import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de notes ? ");
        int n = sc.nextInt();
        double[] notes = new double[n];

        double somme = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Note " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
            somme += notes[i];
        }

        double max = notes[0];
        double min = notes[0];
        for (int i = 1; i < n; i++) {
            if (notes[i] > max) max = notes[i];
            if (notes[i] < min) min = notes[i];
        }

        double moyenne = somme / n;
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Meilleure note : " + max);
        System.out.println("Moins bonne note : " + min);

        if (moyenne >= 10) {
            System.out.println("Resultat : admis");
        } else {
            System.out.println("Resultat : ajourne");
        }
        sc.close();
    }
}
