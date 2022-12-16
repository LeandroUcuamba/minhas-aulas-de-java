/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout2;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author Leandro Ucuamba
 */
public class Layout2 extends JFrame {

    public Layout2()
    {
        super("Layout2-Leandro");
        Container s = getContentPane();
        
        s.setLayout(new GridLayout(2,3));
        s.add(new JButton("1"));
        s.add(new JButton("2"));
        s.add(new JButton("3"));
        s.add(new JButton("4"));
        s.add(new JButton("5"));
        s.add(new JButton("6"));
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setSize(300,300);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Layout2();
        
    }
    
}
