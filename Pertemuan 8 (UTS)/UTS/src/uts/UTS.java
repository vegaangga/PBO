
package uts;

public class UTS {

    public static void main(String[] args) {
        Topeng topeng = new Topeng ("Topeng Malangan","Malang", new Ornamen(200000));
        
        topeng.buatKerajinan();
        System.out.println("Nama Kerajinan= " + topeng.nama);
        System.out.println("Asal = "+topeng.asal);
        System.out.println("Harga Untuk membuat= " + topeng.harga);
        System.out.println("Harga untuk memperbaiki= "+ topeng.harga);
        System.out.println("Harga Ornamen = "+ topeng.ornamen.harga);
    }
    
}
