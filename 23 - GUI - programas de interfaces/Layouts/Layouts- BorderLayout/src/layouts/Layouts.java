/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leandro Ucuamba
 */
public class Layouts extends JFrame{

    public Layouts()
    {
        super("Layouts-Leandro");
        
        Container c = getContentPane();
        
        c.add(BorderLayout.NORTH,new JButton("1"));
        c.add(BorderLayout.SOUTH,new JButton("2"));
        c.add(BorderLayout.CENTER,new JButton("3"));
        c.add(BorderLayout.EAST,new JButton("4"));
        c.add(BorderLayout.WEST,new JButton("5"));
        
        // definicoes do JFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Layouts();
    }
    
}
