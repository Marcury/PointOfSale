package DAO;

import Controllers.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import shop.Product;

/**
 * Whit this class i can get information from database
 * 
 * methods for getting for example ccashier information from DB or all products
 * 
 * standard CRUD, Create, read, update or delete from data source
 **/



public class PointOfSaledao {
    
   // Connection connection = DbConnection.getConnection();
    Statement st = null;
    private int barcode;
    Product product;
    
    
   public Product checkBarcodeInDB(int barcode)
    {
        boolean exist = false;
        try {
            ResultSet result = st.executeQuery("Select * FROM products WHERE id="+barcode);
            while (result.next()){
                int dbBarcode =result.getInt("id");
                
                if(barcode == dbBarcode){
                    exist = true;
                    
                    product = new Product();
                    
                    String name = result.getString("productName");
                    double price = result.getDouble("price");
                    String description = result.getString("description");
                    product.setDescription(description);
                    product.setName(name);
                    product.setPrice(price);
                    
                    return product;
                }
            }
    
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return null;
    }
 
    
}
