
package vega.relasiclass.tugas;

public class Main {
    public static void main(String[] args) {
        Anggota a1 = new Anggota ("A12345","Vega Anggaresta");

        Buku b1 = new Buku ("B1-2","How To Understand PBO","Septian Enggar S.");
        
        Petugas petugas = new Petugas ("PG01","Rachel");
        Peminjaman p1 = new Peminjaman ("P01","24/09/2020","1/10/2020",b1,a1,petugas);
        
        System.out.println("Data Peminjaman Buku Perpustakan TI-2C");
        System.out.println("-------------Data-----------");
        System.out.println(p1.info());
    }
}
