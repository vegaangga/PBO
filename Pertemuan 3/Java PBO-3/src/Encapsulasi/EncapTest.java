/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulasi;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        
        encap.setName("James");
        encap.setAge(35);
        
        System.out.println("Nama: "+encap.getName());
        System.out.println("Age:  "+encap.getAge()+ "\n");
        
       
        encap.setName("Dimas");
        encap.setAge(17);
        
        System.out.println("Nama: "+encap.getName());
        System.out.println("Age:  "+encap.getAge()+ "\n");
        
        encap.setName("Vega");
        encap.setAge(22);
        
        System.out.println("Nama: "+encap.getName());
        System.out.println("Age:  "+encap.getAge()+ "\n"); 
    }
}
