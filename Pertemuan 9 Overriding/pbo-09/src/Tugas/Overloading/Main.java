
package Tugas.Overloading;

public class Main {
    public static void main(String[] args){
        Segitiga s = new Segitiga();
        System.out.println("Hasil dari Sudut= 180-SudutA =>" + s.totalSudut(45));
        System.out.println("Hasil dari Sudut= 180-(sudutA + sudutB) =>" + s.totalSudut(30, 90));
        System.out.println("Hasil dari Keliling (sudutA, sudutB, sudutC) =>" + s.keliling(10, 6, 15));
        System.out.println("Hasil dari Keliling rumus c => " + s.keliling(15, 8));
    }
}
