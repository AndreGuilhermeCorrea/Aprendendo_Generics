package aplicacao3;

import java.util.ArrayList;
import java.util.List;

import modelos.entidade3.Circulo3;
import modelos.entidade3.Forma3;
import modelos.entidade3.Retangulo3;

public class Programa3 {

	public static void main(String[] args) {
		
		

		List<Forma3> myFormas = new ArrayList<>();

		myFormas.add(new Retangulo3(3.0, 2.0));
		myFormas.add(new Circulo3(3.0));
		
		System.out.println("Total Area das formas:  " + totalArea(myFormas));
		
		List<Circulo3> myCirculo = new ArrayList<>();
		myCirculo.add(new Circulo3(3.0));
		myCirculo.add(new Circulo3(8.0));
		myCirculo.add(new Circulo3(2.0));
		
		System.out.println("Total Area dos circulos:  " + totalArea(myCirculo));

	}
	//List<Object> não é o supertipo de qualquer tipo de lista
	
	//List<? extends Forma> list) pode ser de forma ou qualquer outro tipo que seja subtipo de forma
	//com curinga podemos fazer métodos	que recebem um genérico de "qualquer tipo"
	
	public static double totalArea(List<? extends Forma3> list) {
		double sum = 0.0;
		for (Forma3 s : list) {
			sum += s.area();
		}
		return sum;
	}
}