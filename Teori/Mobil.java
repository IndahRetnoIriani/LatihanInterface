package Teori;

public class Mobil implements IKendaraan, ITransportasiDarat{

    @Override
    public void nama() {
        System.out.println("----------------------------------------------------");
        System.out.println("MOBIL");
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
        System.out.println("Jumlah Roda pada mobil adalah 4");
    }

    @Override
    public void merk(){
        System.out.println("Merk mobil yang paling banyak digunakan di Indonesia pada 2021 adalah TOYOTA");
    }

}
