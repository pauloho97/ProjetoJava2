package recursos;

public class FuncionarioServico {
	Funcionario funcionario;

	public FuncionarioServico(Funcionario funcionario) {
		super();
		this.funcionario = funcionario;
	}
	
	public void editarFuncionario() {

		try {
			ValidarFuncionario();
			System.out.println("Validação realizada com sucesso");
			processarEdicaoFuncionario();
			System.out.println("Processo de edição realizada com sucesso");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void ValidarFuncionario() throws Exception {
		if (idEhInvalido(funcionario)) {
			throw new Exception("Funcionario deve ter um ID");
		}
	}

	public boolean idEhInvalido(Funcionario funcionario) {
		if (funcionario.getId() == 0) {
			return true;
		}
		return false;
	}

	public void processarEdicaoFuncionario() throws Exception {
		// simula o processamento da edicao do funcionario.
		boolean sucessoEdicao = true;
		if (sucessoEdicao == false) {
			throw new Exception("Processamento da edição do usuário falhou");
		}
	}

	

}
