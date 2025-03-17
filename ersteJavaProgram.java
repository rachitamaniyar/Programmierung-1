import java.util.Scanner;

//String and scanner introduction
public class uebung1 {
    public static void stringAndScanner() {

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
    //if-else introduction
   public static void ifElse () {
        System.out.println("Enter an Integer: ");
    Scanner num = new Scanner(System.in);
    int nummer= num.nextInt();
    if (nummer>5) {
        System.out.println(nummer +" ist grösser als 5");
    }
    else if (nummer<5) {
        System.out.println(nummer + " ist kleiner als ");
    }
    else {
        System.out.println(nummer +" ist gleich als 5");
    }
}
    //method introduction
     //public static void main(String[] args) {
        //name();
        //wetter();
       // tier();
   //}
    public static void name() {
        System.out.print("Name: Rachita \n");
    }
    public static void wetter() {
        System.out.print("Wetter: Sonnig \n");
    }
    public static void tier() {
        System.out.print("Hundname: Bunny \n");
    }

}
