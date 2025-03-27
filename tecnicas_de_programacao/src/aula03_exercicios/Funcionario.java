package aula03_exercicios;

// alterar pacote se necessario

public class Funcionario {
	
	private static int contadorId = 0;
	private int id;
	private String nome; // nome do func.
    private int idade; // idade do funcionario
	private String data; // data de nascimento.
	private float salario; // salario do funcionario
           
    public Funcionario(String nome, int idade, String data, float salario) {
		super();
		this.id = ++contadorId;
		this.nome = nome;
		this.idade = idade;
		this.data = data;
		this.salario = salario;
	}
    
  //Válida se o funcionário possui nome vazio ou idade 0
  	public void validarFuncionario() throws Exception {
  		if (getNome().isEmpty()) {
  			throw new Exception("[ERRO] - nome não pode ser vazio");
  		}
  		if (getIdade() == 0) {
  			throw new Exception("[ERRO] - idade não pode ser 0");
  		}
  		
  		if (getSalario() < 0) {
			throw new Exception("Salario não pode ser negativo");
		}

  	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", data=" + data + ", salario="
				+ salario + "]";
	}

	

	
    
}
