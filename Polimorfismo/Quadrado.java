package Polimorfismo;

public class Quadrado extends FormaGeometrica {
	protected float lado;
	
	


	public Quadrado(float lado) {
		super();
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}



	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}
