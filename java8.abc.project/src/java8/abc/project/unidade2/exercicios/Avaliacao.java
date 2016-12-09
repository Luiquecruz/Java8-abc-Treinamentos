package java8.abc.project.unidade2.exercicios;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {

		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
		
		// Intervalo de nota válido - 0 a 100
		
		if (nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Nota inválida! Digite um valor no intervalo de 0 a 100.");
			main(null); //recursividade
		} else {
			// Conceitos de avaliação
			if (nota < 50) {
				JOptionPane.showMessageDialog(null, "Conceito: Insuficiente.");
			} else if (nota < 70) {
				JOptionPane.showMessageDialog(null, "Conceito: Regular.");
			} else if (nota < 90) {
				JOptionPane.showMessageDialog(null, "Conceito: Bom.");
			} else {
				JOptionPane.showMessageDialog(null, "Conceito: Exelente.");
			}
			
		}
		
	}

}
