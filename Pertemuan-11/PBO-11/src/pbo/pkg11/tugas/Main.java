/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg11.tugas;

public class Main {
    public static void main (String[] args){
  Singa s = new Singa("Toni",4,"Meong meong", "Coklat");
  s.displayData();
  System.out.println();
    Keledai k = new Keledai("Jajah",4,"Toreet toreet", "Abu-abu");
  k.displayData();
  System.out.println();
    Gorilla g = new Gorilla("Bluang",4,"Groooa groooa", "Coklat");
  g.displayData();
  System.out.println();
  
 }
}
