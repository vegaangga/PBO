
package vega.relasiclass.tugas;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Peminjaman {
    public String noPeminjaman;
    public String tgl_pinjam;
    public String tgl_kembali;
    public Buku buku;
    public Anggota anggota;
    public Petugas petugas;

    public Peminjaman(String noPeminjaman, String tgl_pinjam, String tgl_kembali, Buku buku, Anggota anggota, Petugas petugas) {
        this.noPeminjaman = noPeminjaman;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    
    
    
     public String info (){
        String info = "";
        info += "No Peminjaman: " + noPeminjaman + "\n";
        info += "Judul Buku: " + buku.info() + "\n";
        info += "Tangal Pinjam: " + tgl_pinjam + "\n";
        info += "Tangal Harus dikembalikan: " + tgl_kembali + "\n";
        info += "Judul Buku: " + anggota.info() + "\n";
        info += "Petugas Perpus: " + petugas.info() + "\n";
        return info;
    }
}
