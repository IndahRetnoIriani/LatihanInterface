package Praktikum;

public class Rektor  {
    public void beriSertifikatCumlaude(Mahasiswa mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------------");
    }

    public void beriSertifikatMawapres(PascaSarjana mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagamaina Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------------");
    }

    public void beriSertifikatMawapres(Sarjana sarjanaCum) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagamaina Anda bisa berprestasi?");

        sarjanaCum.menjuaraiKompetisi();
        sarjanaCum.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------------");
    }
}
