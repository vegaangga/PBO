
package vega.relasiclass.tugas;

public class Anggota {
    public String namaAnggota;
    public String nip;

    public Anggota(String nip, String namaAnggota) {
        this.namaAnggota = namaAnggota;
        this.nip = nip;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
      
    public String info(){
        String info = "";
        info += "Id Anggota: " + nip + "\n";
        info += "Nama Anggota: " + namaAnggota + "\n";
        return info;
    }
}
