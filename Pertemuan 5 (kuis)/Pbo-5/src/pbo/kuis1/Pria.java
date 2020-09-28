
package pbo.kuis1;


public class Pria extends Manusia{
   private Wanita istri;
    
    public Pria(){
        
    }
   
    public Pria(int umur, String nama, boolean dewasa,Wanita istri) {
        super(umur, nama, dewasa);
        this.istri = istri;
    }

    public String info(){
        super.info();
        String info ="Data Pria: \n";
        if (umur>=22){
            info += "Umur: " + this.umur + "\n";
            info += "Nama: " + this.nama + "\n";
            info += "Data Istri: " ;
            info += this.istri.info() + "\n";
            
        } else {
        info += "Umur: " + this.umur + "\n";
        info += "Nama: " + this.nama + "\n";
        info += "Pria ini Masih Kuliah\n" ;
        }
        return info;
    }
}
