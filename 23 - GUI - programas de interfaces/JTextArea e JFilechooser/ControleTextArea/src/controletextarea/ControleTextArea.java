/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controletextarea;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Leandro Ucuamba
 */
public class ControleTextArea extends JFrame implements ActionListener {

    JTextArea texto;
    
    public ControleTextArea(){
        super("editor de texto");
        
        texto = new JTextArea(); // declarei pk preciso que ele esteja visivel para usar no metodo abstrato.
        JScrollPane scroll = new JScrollPane(texto);
        texto.setFont( new Font("serif", Font.PLAIN, 26));
        
        JButton botao = new JButton("Abrir arquivo");
        botao.setFont( new Font("serif", Font.PLAIN, 26));
        botao.addActionListener(this);
        
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, scroll);
        c.add(BorderLayout.SOUTH, botao);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,300);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ControleTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         JFileChooser h = new JFileChooser();
         h.showOpenDialog(this); // metodo para escolher os ficheiros;
         File file = h.getSelectedFile();
         try{
             Path caminho = Paths.get(file.getAbsolutePath());
             String retorno = new String(Files.readAllBytes(caminho));
             texto.setText(retorno);
         }
         catch(Exception erro){
             JOptionPane.showMessageDialog(this, "Nao conseguimos carregar o seu arquivo. Lamento!!!");
         }
         
         
    }
    
    
    
}
