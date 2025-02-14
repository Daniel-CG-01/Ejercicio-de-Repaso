package ejercicioRepaso;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.util.Scanner;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjercicioRepaso2 {

	private JFrame frame;
	private JTextField textFieldClave;
	private JTextField textFieldValor;
	private JLabel lblIntroducción1;
	private JLabel lblIntroducción2;
	private JLabel lblIntroducción3;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioRepaso2 window = new EjercicioRepaso2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public EjercicioRepaso2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	HashMap<String, Integer> instituto=new HashMap<>();
	private JButton botonMostrarLista;
	private JTextArea textArea;
	private JScrollBar scrollBar;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblIntroducción1 = new JLabel("Vamos a crear un \"HashMap\" para un instituto.");
		lblIntroducción1.setForeground(new Color(192, 28, 40));
		lblIntroducción1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIntroducción1.setBounds(12, 12, 340, 19);
		frame.getContentPane().add(lblIntroducción1);
		
		lblIntroducción2 = new JLabel("La clave será el nombre de un alumno.");
		lblIntroducción2.setForeground(new Color(192, 28, 40));
		lblIntroducción2.setBounds(12, 43, 340, 19);
		frame.getContentPane().add(lblIntroducción2);
		
		lblIntroducción3 = new JLabel("El valor será la nota del alumno.");
		lblIntroducción3.setForeground(new Color(192, 28, 40));
		lblIntroducción3.setBounds(12, 71, 340, 19);
		frame.getContentPane().add(lblIntroducción3);
		
		JLabel lblClave = new JLabel("Introduce una clave:");
		lblClave.setBounds(12, 117, 152, 15);
		frame.getContentPane().add(lblClave);
		
		JLabel lblValor = new JLabel("Introduce un valor para la clave:");
		lblValor.setBounds(12, 144, 240, 15);
		frame.getContentPane().add(lblValor);
		
		textFieldClave = new JTextField();
		textFieldClave.setBounds(258, 142, 180, 19);
		frame.getContentPane().add(textFieldClave);
		textFieldClave.setColumns(10);
		
		textFieldValor = new JTextField();
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(258, 115, 180, 19);
		frame.getContentPane().add(textFieldValor);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 208, 576, 51);
		frame.getContentPane().add(textArea);
		
		JScrollPane scrollPane= new JScrollPane(textArea);
		scrollPane.setBounds(12, 208, 576, 51);
		frame.getContentPane().add(scrollPane);
		
		botonMostrarLista = new JButton("Mostrar la lista:");
		botonMostrarLista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		botonMostrarLista.setBounds(12, 171, 152, 25);
		frame.getContentPane().add(botonMostrarLista);
	}
}
