import tag1.KuchenRezepte.blueberrypie;
import tag1.KuchenRezepte.cheesecake;

public class BakeCake {
    public static void main(String[] args) {
        cheesecake.BakeCheeseCake();
        cheesecake.ApplePie();
        BakeCake.BakeBestCake();
        blueberrypie.Aufrufen();
    }
    public static void BakeBestCake() {
        System.out.println("All cakes are the best cakes!");
    }
    }
