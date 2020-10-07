package pbo.pkg6.tugas;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;

    private Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    
    
}
