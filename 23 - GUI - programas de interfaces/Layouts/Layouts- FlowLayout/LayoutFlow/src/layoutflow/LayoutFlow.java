/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutflow;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leandro Ucuamba
 */
public class LayoutFlow extends JFrame {

    public LayoutFlow()
    {
        super("LayoutFlow-Leandro");
        
        
        Container s = getContentPane();
        
        s.setLayout(new FlowLayout());
        s.add(new JButton("1"));
        s.add(new JButton("2"));
        s.add(new JButton("3"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new LayoutFlow();
    }
    
}
