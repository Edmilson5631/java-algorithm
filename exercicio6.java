package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio6 {
	public static void main(String[] args) {
		
		String num1 ;
		String num2 ;
		int numero1 ;
		int numero2 ;
		int soma ;
		int subtracao ;
		int multiplicacao;
		String resultado ;
		
		num1 = JOptionPane.showInputDialog("Digite o numero inteiro: ");
		num2 = JOptionPane.showInputDialog("Digite o segundo numero inteiro: ");
		
		numero1 = Integer.parseInt(num1);
		numero2 = Integer.parseInt(num2);
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		
		resultado = "soma: " + soma + "\n" + "Subtração: " + subtracao + "\n" + "Multiplicação: " + multiplicacao;
		
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
	}

}
