/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg12;

/**
 *
 * @author Vega
 */
public class ElectricityBill implements IPayable{
    
    private int kwh;
    private String category;
    
    public ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }
    
    public int getBasePrice(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100; break;
            case "R-2" : bPrice = 200; break;
            
        }
        return bPrice;
    }
    
    @Override
    public int getPaymentAmount() {
    return kwh+getBasePrice();   
    }
    
    public String getBillInfo(){
        return "kwh = "+kwh+"\n"+
                "Category: "+category+"("+getBasePrice()+") pre kwh\n";
    }
}
