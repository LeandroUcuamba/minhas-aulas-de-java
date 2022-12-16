/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controletest;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Leandro Ucuamba
 */
public class ControleTest extends JFrame implements ActionListener {

    JButton ok, cancel;
    JTextField login;
    JPasswordField senha;
    
    public ControleTest()
    {
        super("Textos e senhas");
        
        login = new JTextField();
        senha = new JPasswordField();
        
        ok = new JButton("Ok");
        ok.addActionListener(new BotaoOkListener());
        
        cancel = new JButton("Cancel");
        cancel.addActionListener(new BotaoCancelListener());
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        c.add(new JLabel("Login:"));
        c.add(login);
        c.add(new JLabel("Senha:"));
        c.add(senha);
        c.add(ok);
        c.add(cancel);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {}
    
    class BotaoOkListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
             String s = "login:" + login.getText() + "\nsenha" + new String(senha.getPassword());
             JOptionPane.showMessageDialog(null, s);
        }
    }
    
    class BotaoCancelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            login.setText("");
            senha.setText("");
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        new ControleTest();
    }
    
}
