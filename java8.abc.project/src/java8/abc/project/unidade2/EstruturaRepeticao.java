package java8.abc.project.unidade2;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		// Variaveis
		
		int x = 0;
		int vetor[] = {0,1,2,3,4,5,6,7,8,9,10};
		
		// Estrutura while
		
		while(x < 10) {
			System.out.println("x = " + x);
			x++;
		}
		
		// Estrutura do while
		
		do {
			System.out.println("x = " + x);
			x++;
		} while (x < 10);
		
		// Estrutura for
		
		for(x=0; x<10; x++){
			System.out.println("x = " + x);
		}
		
		// Estrutura for "estendido"
		
		for(int y : vetor) {
			System.out.println(y);
		}
		
	}

}
