/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlecheck;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Leandro Ucuamba
 */
public class ControleCheck extends JFrame implements ItemListener{

    JTextField texto;
    JCheckBox bold,italic;
    
    public ControleCheck(){
        super();
        
        texto = new JTextField("Leandro, vai mudar", 12);
        texto.setFont(new Font("Serif", Font.PLAIN, 26));
        
        bold = new JCheckBox("Bold");
        bold.addItemListener(new CheckListener());
        italic = new JCheckBox("Italic");
        italic.addItemListener(new CheckListener());
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(texto);
        c.add(bold);
        c.add(italic);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
         //este medo é obrigatorio pk pertence a interface ItemListener;
        
    }
   
    class CheckListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(bold.isSelected() && italic.isSelected()){
                texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
            }
            else if(bold.isSelected()){
                texto.setFont(new Font("Serif", Font.BOLD, 26));
            }
            else if(italic.isSelected()){
                texto.setFont(new Font("Serif", Font.ITALIC, 26));
            }
            else{
                setFont(new Font("Serif", Font.PLAIN, 26));
            }
            
            
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ControleCheck();
    }
    
}
