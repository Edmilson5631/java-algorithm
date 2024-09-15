package com.exercicio;

import javax.swing.JOptionPane; 

public class exercicio1 {

	public static void main(String[] args) {
	
	String nome;
	String cargo;
	String dependentes;
	String mensagem;
	
	nome = JOptionPane.showInputDialog("DIgite o nome do funcionario: ");
	
	dependentes = JOptionPane.showInputDialog("Digite a quantidade de dependentes: ");
	
	cargo = JOptionPane.showInputDialog("Digite o cargo do funcionario: ");
	
	mensagem = "dados do funcionario: \n" + "nome: "+ nome+ "\n" + "Quantidade de dependentes: " + dependentes + "\n" + "cargo: " + cargo;
	
	JOptionPane.showMessageDialog(null, mensagem);
	
	
	
	
	
	
	
	
	
	 
	
		
	}
}
