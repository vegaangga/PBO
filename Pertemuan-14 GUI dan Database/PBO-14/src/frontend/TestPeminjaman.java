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

public class TestPeminjaman {
    public static void main(String[] args) {
        Anggota ang = new Anggota().getById(1);
Buku buk = new Buku().getById(5);
Peminjaman pen = new Peminjaman(ang, buk, "2000-11-03", "2000-11-10");

//pen.setTanggalKembali("2021-10-10");
//pen.save();
    
for(Peminjaman p : new Peminjaman().getAll())
{
System.out.println("IDAnggota: " + p.getAnggota().getIdAnggota() + ", ID Buku: " + p.getBuku().getIdbuku());
}
    }
}
