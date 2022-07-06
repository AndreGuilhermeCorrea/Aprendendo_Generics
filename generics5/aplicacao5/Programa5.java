package aplicacao5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa5 {

	public static void main(String[] args) {
		
		//princípio get/put
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		//funçao copy recebendo uma lista especifica que copia para uma lista mais genérica
		copy(myInts, myObjs);
		
		printList(myObjs);
		
		copy(myDoubles, myObjs);

		printList(myObjs);
	}
	
	//definicao do método copy
	//*****ORIGEM******* método copy que recebe uma lista de qualquer tipo que extende  TIPO DE number (List<? extends Number> origem,)
	//*****DESTINO****** método copy que COPIA uma lista de qualquer tipo SUPER TIPO number (List<? super Number> destino)
	//método copy que 
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		//para cada number number da lista de origem (covariancia) Acessa os elementos
		for (Number number : origem) {
			//a lista de destino adiciona elementos para lista de destino (contravariancia) Adiciona os elementos
			destino.add(number);
		}
	}
		
		
		//método para imprimir 
		public static void printList(List<?> list) {
			//para cada objeto da lista
			for (Object obj : list) {
				System.out.print(obj + " ");
		}
			System.out.println();
	}

}
