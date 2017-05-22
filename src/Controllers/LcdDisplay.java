package Controllers;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marcury
 */
public class LcdDisplay extends JFrame{
    private JPanel displayPanel = new JPanel();    
   
    public LcdDisplay(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Point of Sale");
        setContentPane(displayPanel);
        pack();
        setVisible(true);
    }
}
