package Heranca;

public class Professor extends Pessoa {

	private int salaQueDaAula;

	public Professor(String nome, int idade, String endereco, String telefone, int salaQueDaAula) {
		super(nome, idade, endereco, telefone);
		this.salaQueDaAula = salaQueDaAula;
	}

	@Override
	public String toString() {
		return "Professor [salaQueDaAula=" + salaQueDaAula + ", nome=" + nome + ", idade=" + idade + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}

	public int SalaQueDaAula() {
		return salaQueDaAula;
	}
	public int getSalaQueDaAula() {
		return salaQueDaAula;
	}

	public void setSalaQueDaAula(int salaQueDaAula) {
		this.salaQueDaAula = salaQueDaAula;
	}
	
	
}
