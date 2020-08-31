/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vega
 */
public class Amplop {
    private String tipe,merek;
    private int stock;
        
    public void setBarang ()
    {
        tipe = "Amplop";
    }
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
   
    public void tambahStock(int increment)
    {
        stock = stock + increment;
    }
    public void hapusStock (int decrement)
    {
        stock = stock - decrement;
    }
    
    public void cetakStatus()
    {
        System.out.println("Data Barang: "+tipe);
        System.out.println("Merek: "+merek);
        System.out.println("Stock: "+ stock);
        System.out.println();
  }
}
