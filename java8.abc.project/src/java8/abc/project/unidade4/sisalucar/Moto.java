package java8.abc.project.unidade4.sisalucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() { // Exemplo de anulação (Overriding)
		return 1;
	}
	
	public void acelera(int limiteVelocidade) { // Exemplo de Overload
		System.out.println("Obedeça o limite de velocidade! \n Limite: " + limiteVelocidade);
	}

}
