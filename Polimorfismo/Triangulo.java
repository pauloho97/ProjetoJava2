package Polimorfismo;

public class Triangulo extends FormaGeometrica {
	protected float base;
	protected float altura;


	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}




	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub
		
		return (base*altura)/2; 
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	

}
