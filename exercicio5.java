package com.exercicio;

import javax.swing.JOptionPane;

public class exercicio5 {
	public static void main(String[] args) {
		
	String horas;
	int hora ;
	String minutos ;
	int minuto ;
	int total;
	
	horas = JOptionPane.showInputDialog("Digite a hora: ");
	hora = Integer.parseInt(horas);
	
	minutos = JOptionPane.showInputDialog("Digite os minutos: ");
	minuto = Integer.parseInt(minutos);
	
	total = (hora * 60) + minuto;
	
	JOptionPane.showMessageDialog(null, "Total de minutos desde o inicio do dia: " + total + " minutos.");
	
	
	}

}
