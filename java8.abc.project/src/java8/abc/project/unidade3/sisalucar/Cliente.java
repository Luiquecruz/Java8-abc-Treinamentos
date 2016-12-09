package java8.abc.project.unidade3.sisalucar;

public class Cliente {

	long idCliente;
	String cpf, nome, cnh;
	
	//constructors
	
	public Cliente(long idCliente, String cpf, String nome, String cnh) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}

	public Cliente(){ } //construtor vazio
	
}
