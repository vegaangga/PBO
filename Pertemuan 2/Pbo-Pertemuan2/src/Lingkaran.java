public class Lingkaran {
    public double phi=3.14,r=5;
    public double hitungLuas(){
        double luas = (int) (phi * r *r); 
        System.out.println("Luasnya adalah= " + luas);
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2 * phi * r;
        System.out.println("Keliling nya adalah= " + keliling);
        return keliling;
    }
    
    public static void main(String[] args) {
   
        Lingkaran data1 = new Lingkaran ();
        data1.hitungKeliling();
        data1.hitungLuas();
}
}
