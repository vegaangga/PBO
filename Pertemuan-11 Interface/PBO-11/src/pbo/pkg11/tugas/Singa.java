
package pbo.pkg11.tugas;

public class Singa extends Binatang implements Karnivora{
 private String suara;
 private String warnaBulu;
  public Singa (String nama, int jmlKaki, String suara, String warnaBulu){
  super(nama, jmlKaki);
  this.suara=suara;
  this.warnaBulu=warnaBulu;
 }
  public void displayMakan(){
  System.out.println("Jenis: "+jenisK);
  System.out.println("Makanan: "+makananK);
 }
 public void displayBinatang(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 public void displayData(){
  displayMakan();
  displayBinatang();
  System.out.println("Suara: "+suara);
  System.out.println("Warna Bulu: "+warnaBulu);
 }
}
