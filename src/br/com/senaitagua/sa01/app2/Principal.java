package br.com.senaitagua.sa01.app2;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;
public class Principal {

	public static void main(String[] args) {

		int ano1, ano2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lan�amento do avi�o: "));
		
		CalculoBO cbo = new CalculoBO();
		
		
		
		JOptionPane.showMessageDialog(null, "A diferen�a de ano de lan�amento e ano atual � de: " + cbo.somaTempo(ano1, ano2) + " anos.");
		
	}

}
