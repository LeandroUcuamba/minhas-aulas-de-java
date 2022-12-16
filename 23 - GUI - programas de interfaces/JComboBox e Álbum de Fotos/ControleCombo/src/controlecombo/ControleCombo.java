/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlecombo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ControleCombo extends JFrame implements ItemListener {
    
    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens = { 
    new ImageIcon(getClass().getResource("fotos/foto1.jpg")), 
    new ImageIcon(getClass().getResource("fotos/foto2.jpg")),
    new ImageIcon(getClass().getResource("fotos/foto3.jpg")),
    new ImageIcon(getClass().getResource("fotos/foto4.jpg")),
    };

    public ControleCombo(){
        super("Album de fotos");
        
        Container c = getContentPane();
        
        combo = new JComboBox<String>();
        combo.setFont(new Font("serif", Font.PLAIN, 26));
        combo.addItem("Clave");
        combo.addItem("guitarra");
        combo.addItem("hacker");
        combo.addItem("mao da guitarra");
        combo.addItemListener(this);
        
        label = new JLabel(imagens[0]); // esta forma funciona mais nao troca quando mudar o combo; 
        
        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(320,530);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ControleCombo();
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
         if(ie.getStateChange() == ItemEvent.SELECTED ){
             label.setIcon(imagens[combo.getSelectedIndex()]);
         }
    }
    
    
}
