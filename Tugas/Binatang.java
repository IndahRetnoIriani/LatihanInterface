package Tugas;

public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public int getKaki(int jmlKaki){
        return jmlKaki;
    }
    public void displayBinatang(){
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
    }    
}
