package shop;

/**
 *
 * @author Marcury
 */

public class Purchases {
    private int id;
    private Cashier cashier;
    private CodeScanner codeScanner;
    private Customer customer;
    private String date;
    private Product[] products;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setCashier(Cashier cashier)
    {
        this.cashier = cashier;
    }
    
    public Cashier getCashier(){
        return cashier;
    }
    
    public void setCodeScanner(CodeScanner codeScanner){
        this.codeScanner = codeScanner;
    }
    
    public CodeScanner getCodeScanner(){
        return codeScanner;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setProducts(Product[] products){
        this.products = products;
    }
    
    public Product[] getProducts()
    {
        return products;
    }
}
