package tugas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================Data Laptop==================");
                
        Mac m = new Mac ("Macbook Pro", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
        m.tampilMac();
        
        Windows w = new Windows("Lenovo Legion Y920", 4, 8, "Intel Core i7-7820HK", "Li-Polymer 90Wh", "Dilengkapi Mekanikal Keyboard");
        w.tampilWindows();
        
        Pc p = new Pc("Asus", 5, 16, "Intel Core i7", 24);
        p.tampilPc();
    }
}

