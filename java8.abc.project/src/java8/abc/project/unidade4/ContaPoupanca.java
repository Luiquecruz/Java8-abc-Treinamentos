package java8.abc.project.unidade4;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {

		super.saldo = super.saldo + super.saldo * taxa * 3;

	}
	
}
