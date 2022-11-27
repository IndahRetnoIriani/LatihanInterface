package Teori;

public class Pesawat implements IKendaraan {

    @Override
    public void nama() {
        System.out.println("----------------------------------------------------");
        System.out.println("PESAWAT");
    }

    @Override
    public void jenisTransportasi() {
        System.out.println("Pesawat merupakan transportasi udara");
        
    }

    @Override
    public void bahanBakar() {
        System.out.println("Aftur");
        
    }
}
