
package pbo.kuis1;


public class Wanita extends Manusia {
    private Pria suami;
    private Pria anak;

    public Wanita(int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
    }

    public Wanita(int umur, String nama, boolean dewasa, Pria anak) {
        super(umur, nama, dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    
    public String infoWanita(){
        super.info();
        String info ="Data Wanita\n";
        if (umur>=22){
            info += "Umur: " + this.umur + "\n";
            info += "Nama: " + this.nama + "\n";
            info += "Data Suami: " ;
            info += this.suami.info() + "\n";
            info += this.anak.info() + "\n";

        } else {
        info += "Umur: " + this.umur + "\n";
        info += "Nama: " + this.nama + "\n";
        info += this.suami.info() + "\n";
        info += this.anak.info() + "\n";
        }
        return info;
    }
    
}