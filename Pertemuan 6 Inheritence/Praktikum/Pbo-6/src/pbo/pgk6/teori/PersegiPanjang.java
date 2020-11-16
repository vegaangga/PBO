
package pbo.pgk6.teori;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
   
    
    public float luas(){
        float luas = panjang * lebar;
        
        System.out.println("Luas Persegi:"+luas);
        return luas;
    }
    public float kel(){
        float kel = 2*(panjang+lebar);
        
        System.out.println("Keliling Persegi:"+kel);
        return kel;
    }
}
