package convers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valorF;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversor frame = new conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public conversor() {
		setTitle("Conversor de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton botao1 = new JButton("Converter");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
				
				double fahre = Double.parseDouble(valorF.getText());
				double cels = ( fahre - 32 ) / 1.8 ;
				resultado.setText(cels + "C*");
			    }
				
			    catch (Exception Erro) {}	
				
			}
		});
		botao1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(botao1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel fahrenheit = new JLabel("Fahrenheit:");
		fahrenheit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(fahrenheit);
		
		valorF = new JTextField();
		valorF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(valorF);
		valorF.setColumns(10);
		
		JLabel celsius = new JLabel("Celsius:");
		celsius.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panel.add(celsius);
		
		resultado = new JTextField();
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
