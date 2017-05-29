package Controllers;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcury
 */
public abstract class BarcodeScanner {

    private static String input;

    public static String Scan() {

        String input = JOptionPane.showInputDialog("Enter the barcode or `exit`");

        if (input == null) {
            JOptionPane.showMessageDialog(null, "Invalid bar-code");
        } else {
            try {
                int intInput = Integer.parseInt(input);
                return input;
            } catch (NumberFormatException e) {
                if (input.equals("exit")) {
                    Printer.printReceipt(input);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid bar-code");
                }
            }    
        }
        return null;
    }     
    }
