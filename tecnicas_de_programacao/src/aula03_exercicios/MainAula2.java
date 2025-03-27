package aula03_exercicios;
// alterar pacote se necessario

public class MainAula2 {

	public static void main(String[] args) {
		
		try {
			//Objetos das classes Funcionario e CalculadoraPagamentoSalario
			Funcionario funcionario = new Funcionario("paulo", 17, "26/06/1990", 55);
			CalculadoraPagamentoSalario calcularOSalario = new CalculadoraPagamentoSalario();
			
			//Validando informações do funcionario e retornando o cálculo do salário
			funcionario.validarFuncionario();	
			float retornarCalculoSalario = calcularOSalario.calcularSalario(funcionario);
			
			//Imprimindo resultados
			System.out.println(funcionario);
			System.out.println("salário com acréscimos: R$ " + retornarCalculoSalario);
			
		} catch (Exception e) {
			System.out.println("[ERRO] nome ou idade não podem ser vazios ou nulos");
			System.out.println(" e salário não podem ser negativos");
			e.printStackTrace();
		}

	}

}
