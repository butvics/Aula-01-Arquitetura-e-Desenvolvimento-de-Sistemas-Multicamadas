package br.usjt.OO;

public class Esfera extends Tridimensional{
	private double volume;

	public Esfera(double raio) { 
		this.volume = (4*Math.PI * Math.pow(raio, 3))/3; 
	}

	public double volume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Esfera";
	}
}