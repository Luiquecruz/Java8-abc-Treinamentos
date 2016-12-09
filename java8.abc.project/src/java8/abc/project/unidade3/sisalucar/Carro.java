package java8.abc.project.unidade3.sisalucar;

public class Carro {

	long idCarro;
	String fabricante, modelo, placa, cor;
	int ano;
	float valorDiaria;
	Revendedor revendedor;
	
	//constructors
	
	public Carro(long idCarro, String fabricante, String modelo, String placa, String cor, int ano, float valorDiaria, Revendedor revendedor) {
		super();
		this.idCarro = idCarro;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
	}
	
	public Carro(){ } //construtor vazio

	public static void main(String[] args){
		@SuppressWarnings("unused")
		Carro car1 = new Carro(1, "Volkswagen", "Gol", "jvm-0001", "Azul", 2013, 99.90f, Revendedor.ABCVEICULOS);
		@SuppressWarnings("unused")
		Carro car2 = new Carro();
	}
	
}
