package java8.abc.project.unidade3;

public class Conta {

	// Atributos
	
	int numero;
	double saldo, limite;
	String nome;
	
	// Metodos
	
	public boolean saca(double valor) {
		return false;
	}
	
	public void deposita(double valor) {
		
	}
	
	public void transfere(Conta destino, double valor) {
		
	}
	
	// Metodo Main
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.transfere(conta2, 50);
		
	}
	
}
