
package pbo.pkg6.tugas;

public class Dosen extends Pegawai {
    
    public int jumlahSKS;
    public int tarifSKS;
    
    private Dosen (String nip, String nama, String alamat) {
        super.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
    }
   
    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public void setTarifSKS(int tarifSKS) {
        this.tarifSKS = tarifSKS;
    }
    
    
}
