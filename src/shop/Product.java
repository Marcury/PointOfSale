package shop;

/**
 *
 * @author Marcury
 */

public class Product {
   
    private String name;
    private double price;
    private int barcode;
    private String description;

    public String status(){        // prints status of this Object instance
        return name + "," + barcode + "," + price + ",";
    }
    
    
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    
    public void setBarcode(int barcode){
        this.barcode = barcode;
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public void setDescription(String descryption){
        this.description = descryption;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
