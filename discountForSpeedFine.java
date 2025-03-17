import java.sql.SQLOutput;
import java.util.Scanner;

public class RabattStrafe {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Enter the speed: ");
        int geschwindigkeit = entry.nextInt();

        System.out.println("Enter the alcohol level: ");
        float alk = entry.nextFloat();
        entry.nextLine();
        System.out.println("Monat: ");
        String monat = entry.nextLine().toLowerCase();

        int ueberschreitung;
        int fine1 = 0;
        int fine2 = 0;
        double total=0;
        int rabatt=0;

        if (geschwindigkeit > 50 || alk > 0.5) {
            ueberschreitung = geschwindigkeit - 50;
            System.out.println("die überschreitung ist " + ueberschreitung + "km/hr");
            System.out.println("Die alkoholpegel ist " + alk);
            //speed fine calculation
            if (ueberschreitung > 0 && ueberschreitung <= 10) {
                System.out.println("Sie bekommen eine schriftliche verwarnung");
            } else if (ueberschreitung > 10 && ueberschreitung <= 20) {
                fine1 = 30;
            } else if (ueberschreitung > 20 && ueberschreitung <= 30) {
                fine1 = 50;
            } else if (ueberschreitung > 30 && ueberschreitung <= 50) {
                fine1 = 100;
            } else if (ueberschreitung > 50 && ueberschreitung <= 100) {
                fine1 = 500;
            } else if (ueberschreitung > 100) {
                fine1 = 1500;
            } else {
                System.out.println("No speed fine.");
            }
            //alcohol fine calculation
            if (alk >= 0.5 && alk < 1.0) {
                fine2 = 50;
            } else if (alk >= 1.1 && alk < 2.0) {
                fine2 = 100;
            } else if (alk >= 2.0) {
                fine2 = 2500;
            } else {
                System.out.println("No alcohol fine.");
            }
            //calculate fines
            total=fine1+fine2;
            //discount
            switch (monat.toLowerCase()){
                case "march":
                case "april":
                    total= total*0.9;
                    rabatt=10;
                    break;
                case "may":
                case"june":
                    total=total*0.85;
                    rabatt=15;
                    break;
                case "july":
                case"august":
                    total=total*0.8;
                    rabatt=20;
                case"september":
                case"october":
                    total=total*0.75;
                    rabatt=25;
                    break;
                case"november":
                case"december":
                    total=total*0.7;
                    rabatt=30;
                default:
                    rabatt=0;
                        System.out.println("Kein Rabatt mögllich!");
            }
            //final result display
            System.out.println("Die überschreitung strafe: " + fine1 + " EUR");
            System.out.println("Die Alkohol strafe: " + fine2 + " EUR");
            System.out.println("Gesamt strafe: " + total + " EUR");
            System.out.println("Sie bekommen "+ rabatt+"% rabatt");
        } else {
            System.out.println("gute fahrt");
        }
        entry.close();
    }
}
