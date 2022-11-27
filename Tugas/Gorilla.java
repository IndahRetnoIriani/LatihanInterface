package Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;
    
    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis\t\t: Karnivora + Herbivora");
        System.out.println("Makanan\t\t: Daging & Tumbuhan");
    }
    public void displayBinatang(){
        System.out.println("----------------GORILLA----------------");
    }
    public void displayData(){
        super.displayBinatang();
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu); 
        System.out.println("---------------------------------------");      
    }
}
