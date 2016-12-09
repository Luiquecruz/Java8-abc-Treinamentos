package java8.abc.project.unidade2.exercicios;

public class FaturamentoTriSoftware {

	public static void main(String[] args) {

		/*** Declaração de variáveis ***/
		
		double Janeiro = 15_000;
		double Fevereiro = 23_000;
		double Marco = 17_000;
		double VFinal;
		
		/*** Atribuição de valores ***/
		VFinal = Janeiro + Fevereiro + Marco;
		
		System.out.println("O faturamento trimestral da empresa é de: $ " + VFinal);
	}

}
