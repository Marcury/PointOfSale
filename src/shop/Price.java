/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author Admin
 */
public class Price {

    private double amount;
    private String  currency;
    
   public void setAmount(double amount){
       this.amount = amount;
   } 
    
   public double getAmount() {
       return amount;
    }
   
   public void setCurrency(String currency){
       this.currency = currency;
   }

    public String getCurrency() {
        return currency;
    }
    
}
