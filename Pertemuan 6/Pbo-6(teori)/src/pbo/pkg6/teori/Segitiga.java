
package pbo.pgk6.teori;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    
    public float luas(){
        double luas = (alas*tinggi)/2;
        
       System.out.println("Luas Segitiga:"+luas);
        return (float) luas;
    }
   public float kel(){
        double kel = alas+alas+alas;
        
        System.out.println("Keliling Segitiga:"+kel);
        return (float) kel;
    }
}
