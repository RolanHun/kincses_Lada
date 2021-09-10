package kincseslada;

import java.util.Scanner;

public class Ladak {
    static String[] AranyLada = {"1. (Arany Láda)", "Bennem van a kincs!"};
    static String[] EzüstLada = {"2. (Ezüst Láda)", "Nem én rejtem a kincset!"};
    static String[] BronzLada = {"3. (Bronz Láda)", "Az arany láda hazudik!"};
    public static int tipp() {
        System.out.println("Hanyadik ládában van a kincs?");
        Scanner scn = new Scanner(System.in);
        int valasz = scn.nextInt();
        while ((valasz <= 0) || (valasz > 3)) {
            System.out.println("Csak 3 db láda van!");
            valasz = scn.nextInt();
        }
        return valasz;
    }
    public static void futtat() {
        switch (tipp()) {
            case 1:
                System.out.println("");
                System.out.println("Nem nyert!");
                break;
            case 2:
                System.out.println("");
                System.out.println("Nem nyert!");
                break;
            case 3:
                System.out.println("");
                System.out.println("Nyertél!");
                break;
            default:
                break;
        }
}
    public static void leiras() {
        System.out.println("3 darab láda van. Az egyik kincset rejt! Mindegyiken van egy felirat.");
        System.out.println("De csak az egyik mond igazat! Döntsd el melyik ládában van a kincs!");
        System.out.println("");
    }
    public static void ladakLeirasa() {
        System.out.println(AranyLada[0]+" "+AranyLada[1]);
        System.out.println(EzüstLada[0]+" "+EzüstLada[1]);
        System.out.println(BronzLada[0]+" "+BronzLada[1]);
        System.out.println("");
    }
}
