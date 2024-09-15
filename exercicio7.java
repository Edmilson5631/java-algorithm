package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio7 {

	public static void main(String[] args) {
	
	
	String realnum;
	double numero;
	double triplo;
	String resultado;
	
	realnum = JOptionPane.showInputDialog("Digite o numero real: ");
	
	numero =Double.parseDouble(realnum);
	
	triplo = numero * 3;
	
	resultado = "O triplo de " + numero + " é " + triplo;
	
	JOptionPane.showMessageDialog(null, resultado);
	

	}

}
