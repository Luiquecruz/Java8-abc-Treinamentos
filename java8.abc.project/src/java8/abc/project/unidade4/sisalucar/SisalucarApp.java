package java8.abc.project.unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {

		//Objetos
		//Carros
		
		Carro car1 = new Carro();
		car1.setIdCarro(1);
		car1.setFabricante("Volkswagen");
		car1.setModelo("Gol");
		car1.setCor("Azul");
		car1.setPlaca("jdk-0001");
		car1.setAno(2013);
		car1.setValorDiaria(99.90f);
		
		//Adiciona o carro a totalCarros
		totalCarros = totalCarros +1;
		
		//Clientes
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setNome("Pedro Paulo");
		cliente1.setCpf("123.456.789-10");
		cliente1.setCnh("XYZ0001");
		
		@SuppressWarnings("unused")
		Autenticavel aut = cliente1;
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(car1.getIdCarro(), cliente1.getIdCliente(), car1.getValorDiaria());
		
		gerarRelatorioLocacao(car1, LocalDate.now(), LocalDate.now().plusDays(5));
		
	}
	
	// Methods

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao loc = new Locacao();
		loc.setIdCarro(idCarro);
		loc.setIdCliente(idCliente);
		loc.setIdLocacao(1);
		loc.setDataInicial(LocalDate.now());
		loc.setDataFinal(LocalDate.now().plusDays(2));
		loc.setValorLocado(2 * 99.90f);
		
	}
	
	// Exemplo de varargs
	
	public static void gerarRelatorioLocacao(Carro car1, LocalDate...datas) {
		
		@SuppressWarnings("unused")
		float totalFaturado = car1.getValorDiaria();
		
	}

}
