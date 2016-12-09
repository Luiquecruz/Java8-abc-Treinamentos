package java8.abc.project.unidade2;

public class Vetor {

	public static void main(String[] args) {

		//Vetor de tipos primitivos
		// Fibonacci
		
		int fibo[] =  new int[20];
		
		fibo[0] = 1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0] + fibo[1];
		
		for (int i=3; i<20; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int f : fibo) {
			System.out.println(f + ",");
		}
		
		//break row
		System.out.println("\n");
		
		//Vetor de Objetos
		
		String vetor[] = new String[10];
		vetor[0] = new String("Antonio");
		vetor[1] = new String("Luique");
		
		for (String l : vetor){
			System.out.println(l + ".");
		}
		
		//Array
		int matriz[][] = new int[3][3];
		matriz[0][0] = 100;
		
	}

}
