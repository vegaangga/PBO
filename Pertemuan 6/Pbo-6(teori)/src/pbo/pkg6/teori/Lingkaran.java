
package pbo.pgk6.teori;

public class Lingkaran extends BangunDatar{
    public float r;

   public float luas(){
        double luas = 3.14 * r * r;
        
        System.out.println("Luas Lingkaran:"+luas);
        return (float) luas;
    }
   public float kel(){
        double kel = 2*3.14*r;
        
        System.out.println("Keliling Lingkaran:"+kel);
        return (float) kel;
    }
}
