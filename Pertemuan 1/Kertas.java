public class Kertas {
    private String barang;
    private int stock;
        
    public void setBarang (String  newValue)
    {
        barang = newValue;
    }
   
    public void tambahStock(int increment)
    {
        stock = stock + increment;
    }
    public void hapusStock (int decrement)
    {
        stock = stock - decrement;
    }
    
    public void cetakStatus()
    {
        System.out.println("Data Barang: "+barang);
        System.out.println("Stock: "+ stock);
        
  }
}