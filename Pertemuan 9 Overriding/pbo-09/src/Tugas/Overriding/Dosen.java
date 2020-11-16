
package Tugas.Overriding;

public class Dosen extends Manusia{
    public void makan(){
        System.out.print("Untuk Dosen=");
        super.makan();
    }
    public void lembur(){
        System.out.println("Lembur seminggu 5 jam");
    }
}
