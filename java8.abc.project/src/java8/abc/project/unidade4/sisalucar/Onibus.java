package java8.abc.project.unidade4.sisalucar;

public class Onibus extends Veiculo {
	
	public int getPassageiros() {
		return 75;
	}
	
	public void acelera(int limiteVelocidade) {
		System.out.println("Obedeça o limite de velocidade! \n Limite: " + limiteVelocidade);
	}

}
