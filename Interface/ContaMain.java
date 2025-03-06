package Interface;

public class ContaMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(0,"Joao", 1000 , 10);
		ContaPoupanca cp = new ContaPoupanca(0,"Maria", 1);
		
		//Ações para conta corrente
		cc.depositar(15);
		System.out.println(cc);
		cc.sacar(1);
		System.out.println("Conta corrente atualizado: " + cc);
		
		
		//Ações para conta poupança
		cp.depositar(100);
		System.out.println(cp);
		cp.sacar(95);
		System.out.println("Conta poupanca atualizado: " + cp);
	}

}
