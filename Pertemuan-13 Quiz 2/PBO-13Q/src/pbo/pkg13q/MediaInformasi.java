/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg13q;

/**
 *
 * @author Vega
 */
public class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    public int tahunSekarang;

    public int getTahunSekarang(int tahun ) {
        tahunSekarang = tahun;
        return tahunSekarang;
        
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
        
    }
    
    public void reputasi(){
        System.out.println("Pernerbit ini bereputasi");
    }
    
    public void alamatPenerbit(String alamat){
        System.out.println("Alamat Penerbit: " + alamat);
    }
    
    public void tahunBerdiri(int tahun){
        
        System.out.println("Penerbit ini berdiri tahun: " + tahun + ", dan sudah berdiri: " + (this.getTahunSekarang(tahunSekarang)- tahun) + "\n");
        
    }

    
}
