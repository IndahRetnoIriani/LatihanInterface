package Tugas;

public class Main {
    public static void main(String[] args) {

        Keledai k = new Keledai("Kedelai", 4, 
        "Hehehehe", "Abu-Abu");
        k.displayBinatang();
        k.displayMakan();
        k.displayData();

        Gorilla g = new Gorilla("Gulali", 4, 
        "Haaum Hauum", "Hitam Manis");
        g.displayBinatang();
        g.displayMakan();
        g.displayData();
    
        Singa s = new Singa("CingaCing", 4, 
        "Roaar Roaaar", "Coklat");
        s.displayBinatang();
        s.displayMakan();
        s.displayData();
    }
}
