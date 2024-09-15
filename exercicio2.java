package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio2 {
	public static void main(String[] args) {
		
	String numero1 ;
	String numero2 ;
	int num1 ;
	int num2 ;
	int soma ;
	
	numero1 = JOptionPane.showInputDialog("Digite o primeiro numero inteiro: ");
	num1 = Integer.parseInt(numero1);
	
	numero2 = JOptionPane.showInputDialog("Digite o segundo numero inteiro: ");
	num2 = Integer.parseInt(numero2);
	
	soma = num1 + num2;
			
	JOptionPane.showMessageDialog(null, "A soma dos dois numeros é:" + soma);
	
	
	
	
	
	
	
	}

}
