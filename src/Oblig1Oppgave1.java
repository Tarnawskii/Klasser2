import static Objekter_Klasser.Sirkel.*;

public class Oblig1Oppgave1 {


    public static void main(String[] args) {
        double r = 23.5;

        System.out.println("Gitt radius lik " + r);
        System.out.println("Arealet av sirkelen med radius " + r + " er " + getAreal(r));
        System.out.println("Omkretsen av sirkelen med radius " + r + " er " + getOmkrets(r));
        System.out.println("Diameteren av sirkelen med radius " + r + " er " + getDiameter(r));

    }
}
