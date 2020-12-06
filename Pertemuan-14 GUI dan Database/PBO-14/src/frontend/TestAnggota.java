/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Vega
 */
import backend.*;
public class TestAnggota {
    public static void main(String[] args) {
        Anggota ang = new Anggota("Resta", "Mojokerto", "083835366321");
    
        ang.save();
   
        for(Anggota a : new Anggota().getAll())
        {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
