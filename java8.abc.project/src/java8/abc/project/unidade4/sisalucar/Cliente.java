package java8.abc.project.unidade4.sisalucar;

public class Cliente implements Autenticavel{

	private long idCliente;
	private String cpf, nome, cnh;
	
	// Getters and Setters
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	//constructors
	
	public Cliente(){ } //construtor vazio

	public Cliente(long idCliente, String cpf, String nome, String cnh) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}
	
	//interface

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
