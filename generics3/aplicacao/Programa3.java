package aplicacao;

import java.util.ArrayList;
import java.util.List;

import modelos.entidade.Circulo;
import modelos.entidade.Forma;
import modelos.entidade.Retangulo;

public class Programa3 {

	public static void main(String[] args) {

		List<Forma> myFormas = new ArrayList<>();

		myFormas.add(new Retangulo(3.0, 2.0));
		myFormas.add(new Circulo(3.0));
		
		System.out.println("Total Area das formas:  " + totalArea(myFormas));
		
		List<Circulo> myCirculo = new ArrayList<>();
		myCirculo.add(new Circulo(3.0));
		myCirculo.add(new Circulo(8.0));
		myCirculo.add(new Circulo(2.0));
		
		System.out.println("Total Area dos circulos:  " + totalArea(myCirculo));

	}
	//List<? extends Forma> list) pode ser de forma ou qualquer outro tipo que seja subtipo de forma
	public static double totalArea(List<? extends Forma> list) {
		double sum = 0.0;
		for (Forma s : list) {
			sum += s.area();
		}
		return sum;
	}
}