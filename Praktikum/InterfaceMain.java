package Praktikum;


public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Indah");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
    }    
}
