package Heranca;

//Aqui foi deixado abstract para a classe não ser instanciada;
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String endereco;
	protected String telefone;
	
	
	public Pessoa(String nome, int idade, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Exemplo de método abstract
	public abstract boolean chegarEndereco();
	
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
}
