package java8.abc.project.unidade2.exercicios;

public class AppFibonacci {

	public static void main(String[] args) {

		//variaveis
		
		int anterior1 = 1;
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		int soma = anterior1 + anterior2 + calculado;
		double media = soma / 20;
		
		// Lógica para Fibonacci
		
		for (int i=4; i<=20; i++) {
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1 + anterior2;
			soma = soma + calculado;
			System.out.println("Serie de Fibonacci: " + calculado);
		}
		
		System.out.println("Media = " + media);
		
	}

}
