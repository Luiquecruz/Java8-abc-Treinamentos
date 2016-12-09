package java8.abc.project.unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {

		//Objetos
		//Carros
		
		Carro car1 = new Carro();
		car1.idCarro = 1;
		car1.fabricante = "Volkswagen";
		car1.modelo = "Gol";
		car1.cor = "Azul";
		car1.placa = "jdk-0001";
		car1.ano = 2013;
		car1.valorDiaria = 99.90f;
		
		//Adiciona o carro a totalCarros
		totalCarros = totalCarros +1;
		
		//Clientes
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.nome = "Pedro Paulo";
		cliente1.cpf = "123.456.789-10";
		cliente1.cnh = "XYZ0001";
		
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(car1.idCarro, cliente1.idCliente, car1.valorDiaria);
		
		gerarRelatorioLocacao(car1, LocalDate.now(), LocalDate.now().plusDays(5));
		
	}
	
	// Methods

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao loc = new Locacao();
		loc.idCarro = idCarro;
		loc.idCliente = idCliente;
		loc.idLocacao = 1;
		loc.dataInicial = LocalDate.now();
		loc.dataFinal = LocalDate.now().plusDays(2);
		loc.valorLocado = 2 * 99.90f;
		
	}
	
	// Exemplo de varargs
	
	public static void gerarRelatorioLocacao(Carro car1, LocalDate...datas) {
		
		@SuppressWarnings("unused")
		float totalFaturado = car1.valorDiaria;
		
	}

}
