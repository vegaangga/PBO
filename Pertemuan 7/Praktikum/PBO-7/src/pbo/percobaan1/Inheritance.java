
package pbo.percobaan1;

public class Inheritance {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.tunjangan=1000000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();
    }
}
