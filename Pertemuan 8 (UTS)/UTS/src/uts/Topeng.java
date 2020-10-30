
package uts;

public class Topeng extends Kerajinan{
    public Ornamen ornamen;

    public Topeng(String nama, String asal, Ornamen ornamen) {
        super(nama, asal);
        this.ornamen = ornamen;
    }

    
    
    
    public void buatKerajinan(){
        super.harga = 1500000;
    }
}
