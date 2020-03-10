package br.usjt.OO;

public class Trapezio extends Poligono{
	private double area;
	private double perimetro;

	public Trapezio(double basemaior, double basemenor, double altura) {
		super (basemaior, basemenor);
		this.area = (basemaior+basemenor)*altura/2;
		this.perimetro = 2*(Math.sqrt(Math.pow((basemaior - basemenor)/2, 2)+Math.pow(altura, 2)))+basemaior+basemenor; 
	}

	@Override
	public double area() {
		return area;
	}

	@Override
	public String toString() {
		return "Trapezio";
	}

	@Override
	public double perimetro() {
		return perimetro;
	}
}
