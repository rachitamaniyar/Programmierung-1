import java.util.Scanner;

//String and scanner introduction
public class uebung1 {
    public static void main(String[] args) {

        Scanner firstname = new Scanner(System.in);
        Scanner lastname = new Scanner(System.in);
        System.out.print("Vorname einlesen: ");
        String vorname = firstname.next();
        System.out.print("Nachname einlesen: ");
        String nachname = lastname.next();
        String name = vorname + " " + nachname;
        //another variation of combining two strings below
        String name2 = vorname.concat(" " + nachname);
        //Can also assign an int variable for name.length and use that integer later on
        //int lengthofusername=name.length();
        //boolean length = lengthofusername >= 10;
        boolean length = name.length() >= 10;
        System.out.println("Die länge ist mehr als 10: " + length + " und die exakte länge ist " + name.length());
        System.out.println("Willkommen " + name);
    }
}
