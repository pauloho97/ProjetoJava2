package Heranca;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		Professor p = new Professor("Joao", 30, " Rua abc", "513654789", 150);
		Aluno a = new Aluno("roberto", 17, "rua teste", "513645798", 9);
		
		System.out.println("Professor: " + p);
		System.out.println("Aluno " + a);

	}

}
