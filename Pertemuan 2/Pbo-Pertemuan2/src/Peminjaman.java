
public class Peminjaman {
    public int id, harga, lama;
    public String namaMember, namaGame;
    
     public void setId(int newValue){
        id = newValue;
    }
    public void setNamaMember(String newValue){
        namaMember = newValue;
    }
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
     public void setHarga(int newValue){
        harga = newValue;
    }
     public void setLama (int newValue){
         lama = newValue;
     }
        public void tampilData()
    {
        System.out.println("Nomer ID: "+id);
        System.out.println("Nama Member: "+namaMember);
        System.out.println("Nama Game: "+namaGame);
        System.out.println("Harga Game: "+harga);
        System.out.println("Lama Peminjaman (Hari): "+lama);
        System.out.println("Biaya yang harus dibayar Rp: "+harga*lama);
        System.out.println();
  }
  public static void main(String[] args) {
        Peminjaman data1 = new Peminjaman();
        Peminjaman data2 = new Peminjaman ();
        Peminjaman data3 = new Peminjaman ();
        
        System.out.println("=========================================");
        System.out.println("Data Peminjaman Rental Game (PS2, PS3, PS4)");
        System.out.println("=========================================");
        //System.out.println("    Id  |   Nama Member     |   Nama Game   |   Lama Hari   |   Harga   | ");
        
        data1.setId(1);
        data1.setNamaMember("Vega Anggaresta");
        data1.setNamaGame("Uncharted 4");
        data1.setHarga(15000);
        data1.setLama(7);
        data1.tampilData();
        
        
        data2.setId(2);
        data2.setNamaMember("Fifi Maghfirotun");
        data2.setNamaGame("Resident Evil 7: Bio Hazard");
        data2.setHarga(17500);
        data2.setLama(5);
        data2.tampilData();
        
        data3.setId(3);
        data3.setNamaMember("Ivan Eko D");
        data3.setNamaGame("Final Fantasy XII");
        data3.setHarga(20000);
        data3.setLama(3);
        data3.tampilData();
    } 
}
