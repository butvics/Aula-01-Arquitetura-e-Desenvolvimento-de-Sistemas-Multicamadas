package br.usjt.OO;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args){
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Quadrado(2.0));
		figuras.add(new Triangulo(2.0, 4.0));
		figuras.add(new Losango(8.0, 12.0));
		figuras.add(new Retangulo(6.0, 3.0));
		figuras.add(new Circulo(3.0));
		figuras.add(new Trapezio (6.0, 4.0, 2.0));

		ArrayList<Tridimensional> tridimensionais = new ArrayList<Tridimensional>();
		tridimensionais.add(new Cubo (2.0));
		tridimensionais.add(new Esfera(2.0));
		tridimensionais.add(new Cilindro(2.0, 2.0));
		tridimensionais.add(new Piramide(2.0, 4.0));

		for(Tridimensional tridimensional: tridimensionais){  
			System.out.print("\n");
			System.out.println(tridimensional);
			System.out.println("Volume = "+tridimensional.volume());
		}

		for(Figura figura: figuras){
			System.out.print("\n");
			System.out.println(figura);
			System.out.println("Area = "+figura.area()+"\nPerimetro = "+figura.perimetro());
			if (figura instanceof Diagonal){
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}

		}
	}
}
