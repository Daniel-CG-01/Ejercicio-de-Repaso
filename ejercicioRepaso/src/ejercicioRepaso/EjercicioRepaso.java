package ejercicioRepaso;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class EjercicioRepaso {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioRepaso window = new EjercicioRepaso();
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
	
	List<Integer> lista1=new ArrayList<>();
	List<Integer> lista2=new ArrayList<>();
	
	public EjercicioRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Random azar=new Random();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(192, 12, 246, 25);
		frame.getContentPane().add(textArea1);
		
		JScrollPane scrollPane1 = new JScrollPane(textArea1);
		scrollPane1.setBounds(192, 12, 246, 45);
		frame.getContentPane().add(scrollPane1);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(192, 80, 246, 25);
		frame.getContentPane().add(textArea2);
		
		JScrollPane scrollPane2 = new JScrollPane(textArea2);
		scrollPane2.setBounds(192, 112, 246, 45);
		frame.getContentPane().add(scrollPane2);
		
		JButton botonLista1 = new JButton("Añadir a la lista 1: ");
		botonLista1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea1.setText("");
				
				lista1.add(azar.nextInt(10));
				
				for(Integer elemento:lista1) {
					String elementoTexto=Integer.toString(elemento);
					textArea1.append(elementoTexto+" ");
				}
			}
		});
		botonLista1.setBounds(12, 12, 168, 25);
		frame.getContentPane().add(botonLista1);
		
		JButton botonLista2 = new JButton("Añadir a la lista 2: ");
		botonLista2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea2.setText("");
				
				lista2.add(azar.nextInt(10));
				
				for(Integer elemento:lista2) {
					String elementoTexto=Integer.toString(elemento);
					textArea2.append(elementoTexto+" ");
				}
			}
		});
		botonLista2.setBounds(12, 112, 168, 25);
		frame.getContentPane().add(botonLista2);
	}
}
