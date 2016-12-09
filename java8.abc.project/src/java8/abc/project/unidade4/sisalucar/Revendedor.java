package java8.abc.project.unidade4.sisalucar;

public enum Revendedor {
	
	ABCVEICULOS("101010/0001", "Rua das Perdizes, 1500", "Volkswagen"),
	NOSVEICULOS("010101/0001", "Av. Morumbi, 2500", "Honda"),
	BRVEICULOS( "111111/0001", "Av. das Nações, 123", "Toyota");
	
	String cnpj, endereco, fabricante;

	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	
}
