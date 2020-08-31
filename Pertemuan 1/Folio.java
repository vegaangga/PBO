/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vega
 */
public class Folio extends Kertas{
     private String setMerek;
    public void setMerek(String newValue){
        setMerek = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Merk Kertas: "+setMerek);
        System.out.println();
    }
    
}
