package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
	
		double A ;
		double B ;
		double D ;
		String resultado ;
		double A1 ;
		double A2 ;
		double AT ;
		
		A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da A (largura do retângulo inferior): "));
		
		B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B (Altura do retângulo): "));
		
		D = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de D (Largura do retângulo superior): "));
		
		A1 = D * B ;
		A2 = A * B ;
		AT = A1 + A2 ;
		
		resultado = "Area do retângulo (A1):" + A1 + "\n" + "Area do retângulo (A2): " + A2 + "\n" + "Area total (AT): " + AT ;
		
		JOptionPane.showMessageDialog(null, resultado);
		

	}

}
