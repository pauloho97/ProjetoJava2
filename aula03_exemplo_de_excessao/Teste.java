package aula03_exemplo_de_excessao;

public class Teste {
	
	private int id;
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Teste verificacaoDeExcessao = new Teste(10);
		
		int retorno = verificacaoDeExcessao.buscarChave("");
		/*if(retorno < 0) {
			System.out.println("Erro ao executar a busca pela chave");
		}*/
		
		try {
			verificacaoDeExcessao.buscarChaveComExcessao("");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de array");
			
		} catch (Exception e) {
			System.out.println("Erro com excessao ao executar a busca pela chave");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	public Teste(int id) {
		this.id = id;
	}
	
	public int buscarChave(String id) {
		if (id == null | id == "") {
			return -1;
		}
		
		return 0;
	}
	
	public int buscarChaveComExcessao(String id) throws Exception {
		if (id == null ) {
			throw new Exception("Parametro invalido - id nulo");
		}
		
		if ( id == "") {
			throw new Exception("Parametro invalido - id vazio");
		}
		return 0;
	}

}
