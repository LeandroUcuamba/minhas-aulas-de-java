/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Leandro Ucuamba
 */
public class Layout2 extends JFrame {

    public Layout2()
    {
        super("Layout2-LEANDRO");
        
        Container d1 = getContentPane();
        d1.setLayout(new BorderLayout());
        
        Container d = getContentPane();
        
        d.setLayout(new GridLayout(4,1));
        d.add(new JButton("ok"));
        d.add(new JButton("cancel"));
        d.add(new JButton("setup"));
        d.add(new JButton("help"));
        
        d1.add(BorderLayout.CENTER, new JButton("Centro"));
        d1.add(BorderLayout.EAST, d);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Layout2();
    }
    
}
