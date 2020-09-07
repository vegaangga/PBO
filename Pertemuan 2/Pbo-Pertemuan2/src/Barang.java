public class Barang {
    public String kode="L1", namaBarang="Batrei Lenovo Ideapad 110";
    public int hargaDasar=400000;
    public float diskon =15;
    
    
    public int hitungHargaJual (){   
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar/100));
        return hargaJual;
    }
    
    public void tampilData (){
        System.out.println("========Data Penjualan=======");
        System.out.println("Kode: "+kode);
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Harga Dasar: "+hargaDasar);
        System.out.println("Diskon : "+ diskon +"%");
        System.out.println("Harga Jual: " +hitungHargaJual());
    }
    
    public static void main(String[] args) {
        Barang data1 = new Barang();
        data1.tampilData();
}
}
