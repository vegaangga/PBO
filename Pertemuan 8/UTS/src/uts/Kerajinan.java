
package uts;

public class Kerajinan {
    public String nama;
    public float harga;
    public String asal;

    public Kerajinan(String nama, String asal) {
        this.nama = nama;
       this.asal = asal;
    }
    
    public void buatKerajinan(){
         harga = 1000000;
    }
    
    public void perbaikiKerajinan(){
         harga = 500000;
    }
}


