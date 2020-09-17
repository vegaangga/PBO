package koperasisimpanpinjam.angsur10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestKoperasi {
    public static void menu(){
       System.out.println("----------Menu Koperasi Simpan Pinjam---------");
       System.out.println("1. Pinjam");
       System.out.println("2. Angsur ");
       System.out.print("Masukkan Operasi yang diinginkan: ");
   }
    
    public static void main(String[] args) {
        int angsur,pilih;
        Anggota donny = new Anggota("111333444","Donny", 5000000);
        Scanner in=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman() +"\n");
        
        menu ();
        String keputusan="Y";
        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
            int pinjam = 0;
                pilih = in.nextInt();
                switch (pilih){
                case 1:
                    System.out.println("Masukkan Uang yang akan dipinjam: ");
                    pinjam = str.nextInt();
                    if (pinjam >= donny.getLimitPinjaman()){
                        System.out.println("Maaf Jumlah Pinjaman Melebihi Limit" + "\n");
                        System.out.print("Masukkan Operasi yang diinginkan: ");
                        } else{
                        donny.setPinjaman(pinjam);
                        System.out.print("Masukkan Operasi yang diinginkan: ");
                    }

                    break;

                case 2:
                    if (donny.getPinjaman() == 0){
                        System.out.println("Anda Tidak Memiliki Pinjaman");
                    } else{
                    System.out.println("Masukkan Jumlah uang yang akan diangsur: ");
                    angsur = str.nextInt();
                    donny.angsur(angsur);

                }
                System.out.print("Pilih Operasi Lagi? Y/T : ");
            try{
                keputusan = input2.readLine();
                System.out.print("Masukkan Operasi yang diinginkan: ");
            }catch(IOException e){
                 System.out.println("Kata yang anda masukkan salah");
            }
            
        }
    }
}
}
      
        /*System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman() +"\n");
        
        System.out.println("Meminjam Uang: 10.000.000");
        donny.setPinjaman(10000000);
        
        System.out.println("Meminjam Uang: 4.000.000.");
        donny.setPinjaman(4000000);
        
        System.out.println("Mengangsur: 1.000.000");
        donny.angsur(1000000);
        
        System.out.println("Mengangsur: 3.000.000");
        donny.angsur(3000000); */
 