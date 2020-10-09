
package pbo.pgk6.teori;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 8;
        pp.lebar = 4;
        pp.luas();
        pp.kel();
        
        Lingkaran l = new Lingkaran();
        l.r = 22;
        l.luas();
        
        Segitiga s = new Segitiga();
        s.alas = 3;
        s.tinggi = 10;
        s.kel();
        s.luas();
        
        
    }
}