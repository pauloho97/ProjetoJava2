package recursos;

public class FuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("Paulo", 27, "12/12/1197",5000);
		
		FuncionarioServico loja = new FuncionarioServico(funcionario);
		loja.editarFuncionario();
	}

}
