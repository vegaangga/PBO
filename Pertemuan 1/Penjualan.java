
public class Penjualan {
    public static void main(String[] args) {
        // Membuat 2 objek
        
        
        Hvs data1 = new Hvs();
        Folio data2 = new Folio();
        Amplop data3 = new Amplop();
        Pensil data4 = new Pensil();
        
        //Panggil method  
       data1.setBarang("Kertas Hvs");
       data1.tambahStock(20);
       data1.setMerek("Mirage");
       data1.cetakStatus();
       
       data2.setBarang("Kertas Folio");
       data2.tambahStock(30);
       data2.hapusStock(5);
       data2.setMerek("Sinar Dunia");
       data2.cetakStatus();
       
       data3.setBarang();
       data3.tambahStock(10);
       data3.setMerek("Joyko");
       data3.cetakStatus();
       
       data3.setBarang();
       data3.tambahStock(5);
       data3.setMerek("Paperline");
       data3.cetakStatus();
       
       data4.setBarang();
       data4.tambahStock(50);
       data4.setMerek("Stadler");
       data4.cetakStatus();
    }
}
