package br.usjt.OO;

public class Piramide extends Tridimensional{
	private double volume;

	public Piramide(double base, double altura) { 
		this.volume =   (1*base*base*altura)/3; 
	}

	public double volume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Piramide";
	}
}