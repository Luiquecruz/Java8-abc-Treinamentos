package java8.abc.project.unidade2.exercicios;

import java.util.Scanner;

public class AppMedia {

	public static void main(String[] args) {

		@SuppressWarnings("resource") // fix scan warning
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		
		int valor = scan.nextInt();
		int maior, menor = maior = valor;
		double media = 0, soma = 0;
		int num = 0;
		
		while (valor != -1) {
			soma = soma + valor;
			num++;
			
			if (valor > maior) {
				maior = valor;
			} else if (valor < menor) {
				menor = valor;
			}
			
			System.out.println("Digite o valor: ");
			valor = scan.nextInt();
		}
		
		media = soma / num;
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
		System.out.printf("Média = %.2f",media);
		
	}

}
