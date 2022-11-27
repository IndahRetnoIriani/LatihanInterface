package Teori;

public class Motor implements IKendaraan, ITransportasiDarat {

    @Override
    public void nama() {
        System.out.println("----------------------------------------------------");
        System.out.println("MOTOR");
    }

    @Override
    public void jenisTransportasi() {
        System.out.println("Kendaraan Bermotor");
    }

    @Override
    public void bahanBakar() {
        System.out.println("Bensin");
        
    }

    @Override
    public void jumlahRoda() {
        System.out.println("Jumlah Roda pada mobil adalah 2");
    }

    @Override
    public void merk(){
        System.out.println("Merk mobil yang paling banyak digunakan di Indonesia pada 2021 adalah HONDA");
    }
}
