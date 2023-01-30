package br.com.senaitagua.sa01.app2;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;
public class Principal {

	public static void main(String[] args) {

		int ano1, ano2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento do avião: "));
		
		CalculoBO cbo = new CalculoBO();
		
		
		
		JOptionPane.showMessageDialog(null, "A diferença de ano de lançamento e ano atual é de: " + cbo.somaTempo(ano1, ano2) + " anos.");
		
	}

}
