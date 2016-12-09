package java8.abc.project.unidade4.sisalucar;

public class Carro extends Veiculo {

	private long idCarro;
	private String fabricante, modelo, placa, cor;
	private int ano;
	private float valorDiaria;
	private Revendedor revendedor;
	
	// metodos (extensão)

	public Carro() {
	} // construtor vazio

	public int getPassageiros() {
		return 4;
	}

	public void acelera(int limiteVelocidade) {
		System.out.println("Obedeça o limite de velocidade! \n Limite: " + limiteVelocidade);
	}

	public void abastecer(int quantidadeLitros) {
		System.out.println("Para abastecer o carro por completo são necessários: " + quantidadeLitros);
	}

	public void abrirPorta(boolean abrir) {
		if (abrir == true) {
			System.out.println("A porta está aberta.");
		} else {
			System.out.println("A porta está fechada!");
		}
	}

	public void fecharPorta(boolean fechar) {
		if (fechar == true) {
			System.out.println("A porta foi fechada.");
		} else {
			System.out.println("A porta está aberta!");
		}
	}
	
	// Getters and Setters
	
	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Revendedor getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
	
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

	public static void main(String[] args){
		Carro car1 = new Carro(1, "Volkswagen", "Gol", "jvm-0001", "Azul", 2013, 99.90f, Revendedor.ABCVEICULOS);
		car1.acelera();
		car1.getVelocidade();
		car1.freia();
		car1.getPassageiros();
		
		@SuppressWarnings("unused")
		Carro car2 = new Carro();
	}
	
}
