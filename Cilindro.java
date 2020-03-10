package br.usjt.OO;

public class Cilindro extends Tridimensional{
	private double volume;

	public Cilindro(double raio, double altura) { 
		this.volume = (Math.PI * Math.pow(raio, 2)*altura); 
	}

	public double volume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Cilindro";
	}
}