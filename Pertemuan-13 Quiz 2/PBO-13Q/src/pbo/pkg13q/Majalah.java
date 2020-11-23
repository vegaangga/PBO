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
public class Majalah extends MediaInformasi{

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman + 2;
        System.out.println("Majalah ini memiliki Halaman: "+jmlHalaman);
        System.out.println("Jika dihitung dengan covernya maka jumlah halaman: " + this.jmlHalaman);
    }
    
    public void reputasi(){
        System.out.println("Penerbit majalah ini bereputasi");
    }
}
