package Interface;

public class ContaCorrente extends ContaBancaria implements Conta {

	private float limite;
	private float tarifa;
	
	

	public ContaCorrente(float saldo, String nome, float limite, float tarifa) {
		super(saldo, nome);
		this.limite = limite;
		this.tarifa = tarifa;
	}

	@Override
	public void depositar(float valor) {
		// TODO Auto-generated method stub
		if (valor > 0) {
			saldo += valor;
		}
		
	}
	
	@Override
	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		if (valor <= saldo && valor >=0) {
			saldo -= valor;
			return true;
		}
		return false;
	}


	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	
	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + ", limite=" + limite + ", nome=" + nome + ", tarifa=" + tarifa + "]";
	}
	

	

}
