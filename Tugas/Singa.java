package Tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis\t\t: Karnivora");
        System.out.println("Makanan\t\t: Daging");
    }
    public void displayBinatang(){
        System.out.println("----------------SINGA------------------");
    }
    public void displayData(){ 
        super.displayBinatang();      
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu); 
        System.out.println("---------------------------------------");      
    }
}
