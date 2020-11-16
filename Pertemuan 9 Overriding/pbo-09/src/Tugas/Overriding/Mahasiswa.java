
package Tugas.Overriding;

public class Mahasiswa extends Manusia{
    public void makan(){
        System.out.print("Untuk Mahasiswa=");
        super.makan();
    }
    public void tidur(){
        System.out.println("Tidur sehari maksimal 7 jam");
    }
}
