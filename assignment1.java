//
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        options();
    }
    public static void reverse () {
        Scanner entry = new Scanner(System.in);
        System.out.println("bitte eine Zeichenfolge eingeben: ");
        String original = entry.nextLine();
        String reversed = "";
        int length=original.length();
        for (int i=length-1; i>=0; i--) {
            reversed = reversed+original.charAt(i);
        }

        System.out.println("die Zeichenfolge in umgekehrter Reihenfolge: " + reversed);
    }
    public static void evenodd() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");
        int i = entry.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " ist eine gerade Zahl.");
        } else {
            System.out.println(i + " ist eine ungerade Zahl.");
        }
    }
    public static void vowel() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Bitte schreiben hier ein Satz: ");
        String satz = entry.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i < satz.length(); i++) {
            char c=satz.charAt(i);
            if (c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter++;
            }
        }
        System.out.println("Es gibt in diesem Satz " + counter + " Vokalen.");
    }
    public static  void factorial(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl für Faktorial eingeben: ");
        int input = entry.nextInt();
        int copy=input;
        int produkt1=1;
        for (int i =0;i<input; i++){
            produkt1=produkt1*copy;
            copy--;
        }
        System.out.println("die faktorial für "+input+" ist "+ produkt1);
    }
    public static void options() {
        Scanner entry = new Scanner(System.in);
        System.out.println("bitte wählen einie option von unten:\n1.umgekehrter Reihenfolge\n2.Gerade oder ungerade Zahl\n3.Vokale in eine Satz\n4.Faktorial von eine ganze Zahl");
        boolean validInput = false;
        int input = 0;
        while (!validInput) {
            if (entry.hasNextInt()) {  // Check if the next input is an integer
                input = entry.nextInt();
                if (input == 1 || input == 2 || input == 3 || input == 4) { // Valid inputs
                    validInput = true;
                } else {
                    System.out.println("Bitte eingeben eine Zahl zwischen 1 und 4.");
                }
            } else {
                System.out.println("Bitte eingeben eine Zahl zwischen 1 und 4.");
                entry.nextLine(); // Clear the invalid input
            }
        }
        if (input == 1) {
            reverse();
        } else if (input == 2) {
            evenodd();
        } else if (input == 3) {
            vowel();
        } else if (input == 4) {
            factorial();
        }
    }
}
