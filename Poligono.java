package br.usjt.OO;

public abstract class Poligono extends Figura{
	private double altura;
	private double base;
	private double basemaior;
	private double basemenor; 
	
	
	public Poligono (double altura, double base){
		this.altura = altura;
		this.base = base;
	}

	public double getAltura(){
		return altura;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double getBase(){
		return base;
	}

	public void setBase(double base){
		this.base = base;
	}

	@Override
	public double area(){
		return 0;
	}
	
	@Override
	public double perimetro() {
		return 0;
	}

	public double getBasemaior() {
		return basemaior;
	}

	public void setBasemaior(double basemaior) {
		this.basemaior = basemaior;
	}

	public double getBasemenor() {
		return basemenor;
	}

	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}
} 