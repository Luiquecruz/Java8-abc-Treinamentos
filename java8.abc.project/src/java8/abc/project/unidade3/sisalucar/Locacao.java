package java8.abc.project.unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {

	long idLocacao, idCliente, idCarro;
	float valorLocado;
	LocalDate dataInicial, dataFinal;
	
	//constructors
	
	public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate dataInicial,
			LocalDate dataFinal) {
		super();
		this.idLocacao = idLocacao;
		this.idCliente = idCliente;
		this.idCarro = idCarro;
		this.valorLocado = valorLocado;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	
	public Locacao(){ } //construtor vazio

}
