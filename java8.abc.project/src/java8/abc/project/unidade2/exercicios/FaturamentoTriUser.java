package java8.abc.project.unidade2.exercicios;

import javax.swing.JOptionPane;

public class FaturamentoTriUser {

	public static void main(String[] args) {

		/*** Declaração de variáveis ***/
		
		double Janeiro;
		double Fevereiro;
		double Marco;
		double Faturamento;
		
		/*** Atribuição através do usuário ***/
		
		Janeiro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas de Janeiro: "));
		Fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas de Fevereiro: "));
		Marco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas de Março: "));
		
		Faturamento = Janeiro + Fevereiro + Marco;
		
		JOptionPane.showMessageDialog(null, "Resultado do faturamento trimestral: R$" + Faturamento);
	}

}
