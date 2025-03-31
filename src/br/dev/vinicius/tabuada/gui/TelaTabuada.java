package br.dev.vinicius.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		// Definir o tamanho da tela 
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(800, 600);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		//criar JLAbel
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do Multiplicando: ");
		labelMultiplicando.setBounds(50, 40, 150, 35);
		labelMultiplicando.setText("Valor do Multiplicador Menor: ");
		labelMultiplicando.setBounds(95, 40, 150, 35);
		
		//Criar JTextField
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(200, 40, 70, 30);
		
		
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMultiplicando);
		
		tela.setVisible(true);
	}
	
}
