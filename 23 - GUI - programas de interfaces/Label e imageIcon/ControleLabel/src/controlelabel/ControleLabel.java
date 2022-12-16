/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelabel;

import com.sun.prism.paint.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Leandro Ucuamba
 */
public class ControleLabel extends JFrame{

    public ControleLabel()
    {
        super("Label-Leandro");
        
        JLabel simples = new JLabel("Label Simples");
        simples.setToolTipText("Meu texto"); // quando eu passar o mouse sobre a label vai aparecer este texto;
        
        // Aqui e o codigo da label'letra' azul;
        Font fonte = new Font("Serif", Font.BOLD | Font.ITALIC, 28);
        JLabel label = new JLabel("Label Simples");
        label.setFont(fonte);
        label.setForeground(java.awt.Color.blue);
        
        // Aqui e o codigo onde adicionei a imagem;
        ImageIcon icon = new ImageIcon(getClass().getResource("foto/Angola.png"));
        JLabel imagem = new JLabel(icon); // Ctrl+space para escolher propostas;
        
            
        // aqui usamos o FlowLayout e adicionamos as label's;
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        c.add(label);
        c.add(imagem);
        
        // codigo herdado da JFrame;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ControleLabel();
    }
    
}
