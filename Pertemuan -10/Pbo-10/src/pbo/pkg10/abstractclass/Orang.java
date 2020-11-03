
package pbo.pkg10.abstractclass;

public class Orang {
    private String nama;
    private Hewan hewanPelhiaraan;
    
    public Orang (String nama){
        this.nama = nama;
    }
    
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPelhiaraan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " +this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara: ");
        this.hewanPelhiaraan.bergerak();
        System.out.println("----------------------------------------");
    }
}
