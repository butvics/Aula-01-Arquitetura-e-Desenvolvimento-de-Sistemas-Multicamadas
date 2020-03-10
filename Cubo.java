package br.usjt.OO;

public class Cubo extends Tridimensional{
	private double volume;

	public Cubo(double base) {
		this.volume = base*base*base; 
	}

	public double volume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Cubo";
	}
}