package java8.abc.project.unidade2.exercicios;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		/*** Metodo de leitura através de linha de comando ***/
		
		@SuppressWarnings("resource") // fix for scan warning
		Scanner scan = new Scanner(System.in);
		
		/*** Leitura de operações ***/
		
		System.out.println("Digite o primeiro valor:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int num2 = scan.nextInt();
		
		/*** Declaração de variaveis + Operadores ***/
		
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		float divisao = (float) num1 / num2;
		
		/*** Output ***/
		
		System.out.println("\n"); // identação
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Multiplicação = " + multiplicacao);
		System.out.printf("Divisão = %.3f", divisao);
		
		/*** Output lógica ***/
		
		System.out.println("\n"); // identação
		
		System.out.println("O primeiro valor é maior que o segundo? \n" + (num1>num2));
		System.out.println("O primeiro valor é igua ao segundo valor? \n" + (num1==num2));
		System.out.println("O primeiro valor é menor que o segundo? \n" + (num1<num2));
		
	}

}
