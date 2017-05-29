package Controllers;

import javax.swing.JTextField;


/**
 *
 * @author Marcury
 */
public abstract class LcdDisplay {
  //printing everything on LCD
    private static String sum;
            
    public static void setBcodeField(JTextField field, String bCode){
        field.setText(bCode);
    }
    public static void setTotalCostPrinter(JTextField field, double total){
        sum = Double.toString(total);
        field.setText(sum);
    }
            
}
