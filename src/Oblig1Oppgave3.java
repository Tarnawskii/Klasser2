import javax.swing.*;

public class Oblig1Oppgave3 {

    public static void main(String[] args) {

        String invare1navn = JOptionPane.showInputDialog("Hva er navnet på varen?");
        String invare1antall = JOptionPane.showInputDialog("Hva er antallet?");
        String invare1pris = JOptionPane.showInputDialog("Hva er prisen?");

        String invare2navn = JOptionPane.showInputDialog("Hva er navnet på varen?");
        String invare2antall = JOptionPane.showInputDialog("Hva er antallet?");
        String invare2pris = JOptionPane.showInputDialog("Hva er prisen?");

        int vare1antall;
        double vare1pris;

        int vare2antall;
        double vare2pris;

        try {
            vare1antall = Integer.parseInt(invare1antall);
            vare1pris = Double.parseDouble(invare1pris);

            vare2antall = Integer.parseInt(invare2antall);
            vare2pris = Double.parseDouble(invare2pris);
        }
        catch(Exception e) {
            vare1antall=0;
            vare1pris=0;
            vare2antall=0;
            vare2pris=0;
            System.out.print("Du må skrive inn tall både på antall og pris");
        }

            Vare vare1 = new Vare(invare1navn, vare1antall, vare1pris);
            Vare vare2 = new Vare(invare2navn, vare2antall, vare2pris);

            double vare1totalPris = vare1.getTotalPris();
            double vare2totalPris = vare2.getTotalPris();
            double totalPrisen = vare1totalPris + vare2totalPris;

            System.out.println("Prisen er: "+ totalPrisen+ " kr.");
    }
}
