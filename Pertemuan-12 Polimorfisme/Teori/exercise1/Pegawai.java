/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori.exercise1;

/**
 *
 * @author Vega
 */
public class Pegawai {
    protected String nama ;
    protected int gaji;
    
    Pegawai(){
    }
    Pegawai(String nama , int gaji){
        this.nama =nama;
        this.gaji=gaji;
    }
    public int getGaji() {
        return gaji;
    }
}
