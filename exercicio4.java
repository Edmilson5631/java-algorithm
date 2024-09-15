package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio4 {
	public static void main(String[] args) {
		
		
	String cotacao ;
	double cotacaodolar ;
	String valordolar ;
	double valordolares;
	double valorreal ;
	
	cotacao = JOptionPane.showInputDialog("Digite a cotação do dólar: ");
	cotacaodolar = Double.parseDouble(cotacao);
	
	valordolar = JOptionPane.showInputDialog("Digite o valor em doláres: ");
	valordolares = Double.parseDouble(valordolar);
	
	valorreal = valordolares * cotacaodolar ;
	
	JOptionPane.showMessageDialog(null, "O valor de " + valordolares + " dólares é equivalente a " + valorreal + " reais." );
	
	
	}

}
