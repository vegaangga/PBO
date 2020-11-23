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
public class Buku extends MediaInformasi{

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman + 4;
        System.out.println("Buku ini memiliki jumlah Halaman: "+jmlHalaman);
        System.out.println("Jika dihitung dengan covernya maka jumlah halaman: " + this.jmlHalaman +
                " Lebih tebal dari majalah karena terdapat cover didalam cover");
    }
    
    public void reputasi(){
        System.out.println("Penerbit Buku ini bereputasi");
    }
}
