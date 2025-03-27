package aula03_exercicios;
// alterar pacote se necessario

public class CalculadoraPagamentoSalario {

	private float resultadoFinalSalario; // resultado final
	


	
	// esse método calcula o salário do funcionário sendo menor ou maior que 1000, chamando seus métodos
	// instancia também o atributo funcionario da classe Funcionario como parãmetro
	public float calcularSalario(Funcionario funcionario)  {
			
		if (funcionario.getSalario() < 1000) {
			return calcularSalarioMenorQue1000(funcionario);
		}

		return calcularSalarioMaiorQue1000(funcionario);

	}

	private float calcularSalarioMenorQue1000(Funcionario funcionario) {
		float aumentoEmPorcentagem = 0.1f;
		resultadoFinalSalario = (funcionario.getSalario() * aumentoEmPorcentagem) + funcionario.getSalario();

		return resultadoFinalSalario;

	}

	private float calcularSalarioMaiorQue1000(Funcionario funcionario) {
		float aumentoEmPorcentagem = 0.2f;
		resultadoFinalSalario = (funcionario.getSalario() * aumentoEmPorcentagem) + funcionario.getSalario();

		return resultadoFinalSalario;

	}
	
	public float getResultadoFinalSalario() {
		return resultadoFinalSalario;
	}

	public void setResultadoFinalSalario(float resultadoFinalSalario) {
		this.resultadoFinalSalario = resultadoFinalSalario;
	}
	
}
