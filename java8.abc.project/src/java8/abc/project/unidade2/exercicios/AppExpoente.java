package java8.abc.project.unidade2.exercicios;

import java.util.Scanner;

public class AppExpoente {

	public static void main(String[] args) {

		//Scanner para entrada de dados através do usuário
		
		@SuppressWarnings("resource") // fix for scan warning
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de X:");
		
		//Variaveis
		
		double x = scan.nextDouble();
		double e = 0;
		
		for (int y = 1; y <= 50; y++) {
			e = e + Math.pow(x, y) / y;
		}
		
		System.out.printf("O valor de e(x)= %.2f", e);
		
	}

}
