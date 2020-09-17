package manajer;

import koperasigettersetter.*;

public class Manajer extends Anggota{
    public String posisiMn;
    
    public Manajer(String nama, String alamat) {
        super(nama, alamat);
    }
    
    public void info(){
        System.out.println("Nama: "+ super.nama);
        System.out.println("Posisi: " +this.posisiMn);
    }
    
}
