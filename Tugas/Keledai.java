package Tugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis\t\t: herbivora");
        System.out.println("Makanan\t\t: Tumbuhan");
    }
    public void displayBinatang(){
        System.out.println("----------------KELEDAI----------------");
    }
    public void displayData(){
        super.displayBinatang();
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu); 
        System.out.println("---------------------------------------");      
    }
}
