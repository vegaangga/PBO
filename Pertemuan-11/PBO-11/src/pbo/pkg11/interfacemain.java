
package pbo.pkg11;
import pbo.pkg11.ICumlaude;
import pbo.pkg11.Mahasiswa;
import pbo.pkg11.Mahasiswa;
import pbo.pkg11.PascaSarjana;
import pbo.pkg11.PascaSarjana;
import pbo.pkg11.Rektor;
import pbo.pkg11.Rektor;
import pbo.pkg11.Sarjana;
import pbo.pkg11.Sarjana;
public class interfacemain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Vega");
        Sarjana SarjanaCumlaude = new Sarjana("Brian");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
    
}
