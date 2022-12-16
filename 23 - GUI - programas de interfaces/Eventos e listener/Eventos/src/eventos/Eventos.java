/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leandro Ucuamba
 */
public class Eventos extends JFrame implements ActionListener { 
// Action listener e uma interface

    public Eventos()
    {
        super("Eventos-Leandro");
        
        JButton k = new JButton("Clique aqui");
        k.addActionListener(this); // o this "refere-se a classe" e este metodo ele adiciona esta classe para ser um dos seus ouvintes; 
        getContentPane().add(k);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) { // este metodo é abstrato e esta na interface 
     
        System.out.println("Clicou aqui");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Eventos();     
    }
    
}
