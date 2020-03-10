package br.usjt.OO;

public class Retangulo extends Poligono implements Diagonal{
	private double area;
	private double perimetro; 

	public Retangulo (double base, double altura) {
		super (base, altura);
		this.area = base*altura;
		this.perimetro = (2*base+2*altura);
	}

	@Override
	public double area() {
		return area;
	}
	
	@Override
	public String toString() {
		return "Retangulo";
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt(2)*getBase();
	}
	
	@Override
	public double perimetro() {
		return perimetro;
	}
}