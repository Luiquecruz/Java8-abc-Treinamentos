package java8.abc.project.unidade4;

public class Conta {

	// Atributos

	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente[];

	// Metodos

	public boolean saca(double valor) {
		
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else {
			return false; //Não realiza o saque
		}
		
	}

	public void deposita(double valor) {
		
		saldo = saldo + valor;
		
	}

	public void transfere(Conta destino, double valor) {
		
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
		} else {
			System.out.println("Error \nNão foi possível realizar transferência! \nSaldo insuficiente.");
		}

	}
	
	public void atualiza(double taxa) {
		
		this.saldo = this.saldo + this.saldo * taxa;
		
	}

	// Getters and Setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente[]) {
		this.cliente = cliente;
	}
	
	// metodo main

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setCliente(new Cliente[5]); //1 até 5 clientes
		
	}

}
