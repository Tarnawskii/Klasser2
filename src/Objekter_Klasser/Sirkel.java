 package Objekter_Klasser;

    public class Sirkel {

        public static String getDiameter (double r){
            double diameter= r*2;
            String diameterMedToDesimaler = String.format("%.2f", diameter);
            return diameterMedToDesimaler;
        }

        public static String getOmkrets (double r){
            double omkrets = 2*Math.PI*r;
            String omkretsenMedToDesimaler = String.format("%.2f", omkrets);
            return omkretsenMedToDesimaler;
        }

        public static String getAreal (double r){
            double areal = Math.PI*Math.pow(r,2);
            String arealMedToDesimaler = String.format("%.2f", areal);
            return arealMedToDesimaler;
        }
    }
