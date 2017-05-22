package shop;

/**
 *
 * @author Marcury
 */

public class Product {
    private String name;
    private Price price;
    private int barcode;
    private String description;
    private int amount;                 //number of products in stock

    public String status(){        // prints status of this Object instance
        return name + "," + barcode + "," + price + "," + amount +
                "," + price.getAmount() + "," + price.getCurrency();
    }
    
    
    public void setPrice(Price price){
        this.price = price;
    }
    public Price getPrice(){
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
    
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
