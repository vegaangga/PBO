package koperasisimpanpinjam.angsur10;


public class Anggota {
    private String nama;
    private float limit;
    private float pinjaman;
    private String nik;
    
    Anggota(String nik, String nama, float limit){
        this.nik = nik;
        this.nama = nama;
        this.limit = limit;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public float getPinjaman() {
        return pinjaman;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setPinjaman(float uang) {
             pinjaman += uang;
             if (pinjaman >= limit){
                 System.out.println("Maaf Jumlah Pinjaman Melebihi Limit" + "\n");
             } else{
                 System.out.println("Berhasil Meminjam: "+ pinjaman );
             }
             System.out.println("Jumlah Pinjaman sekarang: "+pinjaman + "\n");
             
    }
    
    
    
    public void angsur(float uang){
        float angsur = pinjaman*10/100;
        if (uang <= angsur){
            System.out.println("Maaf Angsuran harus 10% dari pinjaman");
        } else {
        pinjaman -=uang;
            System.out.println("Jumlah Sisa Pinjaman saat ini: "+pinjaman + "\n");
        }
           
    }
    
    public float getLimitPinjaman(){
        return limit;
    }

}
