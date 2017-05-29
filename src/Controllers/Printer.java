package Controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import shop.Cashier;
import shop.CodeScanner;
import shop.Customer;
import shop.Product;

/**
 *
 * @author MArcury
 */
public abstract class Printer {
    
    private static ArrayList<Product> itemList = new ArrayList<Product>();
    private static Customer customer = new Customer();
    private static Cashier cashier = new Cashier();
    private static CodeScanner cs = new CodeScanner();
    private static Product product1 = new Product();
    private static Product product2 = new Product();
    private static Product product3 = new Product();
    private static double total=0;
    private static DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static Date date;
    
    public static void printReceipt(String receipt){
        /**printer is pritning receipt
         * for the needs of this project i'm creating artificial values so i could 
         * print some values on receipt
         * receipt = "here gonna be list of products";
      **/
        createReceipt();
        receipt = " List of purchased items "+System.lineSeparator()+"Name      Barcode      Price"+System.lineSeparator();
        for (Product product : itemList)
        {   receipt +="======================"+System.lineSeparator();
            total += product.getPrice();
            receipt += product.getName()+" "+product.getBarcode()+" "+product.getPrice()+System.lineSeparator();   
        }
        receipt += "======================"+System.lineSeparator()+"Total amount: "+String.format("%.2f",total)+System.lineSeparator()+"======================"+ System.lineSeparator();
        receipt += "Cashier id: "+cashier.getId()+ System.lineSeparator()+"Customer id: "+customer.getId()+System.lineSeparator()+"Point of Sale id: "+cs.getId()+ System.lineSeparator();
        receipt += "======================"+System.lineSeparator()+"Date: "+df.format(date);
       
        
        
        JOptionPane.showMessageDialog(null,receipt);
    }
    
    public static void createReceipt()
    {
        date = new Date();
        cs.setId(11);
        cashier.setId(7);
        customer.setid(24);
        
        product1.setBarcode(003);
        product1.setName("Chleb");
        product1.setPrice(1.73);
        
        product2.setBarcode(138);
        product2.setName("Woda");
        product2.setPrice(2.4);
        
        product3.setBarcode(987654321);
        product3.setName("Wino");
        product3.setPrice(19.99);
        
        itemList.add(product1);
        itemList.add(product2);
        itemList.add(product3);
        
        
    }
   
}
