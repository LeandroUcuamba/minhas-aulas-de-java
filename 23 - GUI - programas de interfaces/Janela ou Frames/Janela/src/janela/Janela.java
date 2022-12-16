/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leandro Ucuamba
 */
public class Janela {

    public Janela(){
        
        JFrame s = new JFrame("Leandro");
        JButton botao = new JButton("Clique");
   
        // o metodo getContentPane serve para add componentes na frame "tais como: botao,radio,imagens"
        s.getContentPane().add(botao);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setSize(400,400);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Janela();
    }
    
}
