package koperasisimpanpinjam;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444","Donny", 5000000);
        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman() +"\n");
        
        System.out.println("Meminjam Uang: 10.000.000");
        donny.setPinjaman(10000000);
        
        System.out.println("Meminjam Uang: 4.000.000.");
        donny.setPinjaman(4000000);
        
        System.out.println("Membayar Angsuran: 200.000");
        donny.angsur(200000);
        
        System.out.println("Membayar Angsuran: 3.000.000");
        donny.angsur(3000000);
    }
}
