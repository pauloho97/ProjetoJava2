package Polimorfismo;

public class FormaGeometricaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado forma1 = new Quadrado(10);
		Triangulo forma2 = new Triangulo(10,5);
		
		System.out.println(forma1);
		System.out.println(forma2);
		
		FormaGeometrica.mostrar(forma1);
		FormaGeometrica.mostrar(forma2);
		
	}

}
