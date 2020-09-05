
public class Hvs extends Kertas {
    private String setMerek;
    private int harga;
    public void setMerek(String newValue){
        setMerek = newValue;
    }
    public void setHarga(int newValue){
        harga = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Merk Kertas: "+setMerek);
        System.out.println("Harga: " +harga+" /3 lembar");
        System.out.println();
    }
    
    
    
}
