
package pbo.kuis1;

public class Manusia {
    public int umur;
    public String nama;
    private boolean dewasa;

    public Manusia() {
       
    }

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean getDewasaPria(){
        if(umur<=22){
        dewasa = false;
        }else{
        dewasa = true;
        }
        return dewasa;
    }
    
     public boolean getDewasaWanita(){
        if(umur<=20){
        dewasa = false;
        }else{
        dewasa = true;
        }
        return dewasa;
    }
    
    public String info(){
        String info ="";
        info += "Umur: " + this.umur + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }


}
