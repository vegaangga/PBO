/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori.exercise1;

/**
 *
 * @author Vega
 */
public class TestBayaran {
    public static void main(String[] args) {

        Manager man = new Manager("Agus",800,50);
        Programmer prog = new Programmer("Budi",600,30);

        Bayaran hr = new Bayaran();
        Bayaran a = new Bayaran();
                
        System.out.println("Bayaran Manager : "+hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer : "+hr.hitungBayaran(prog));
               
    }
}
