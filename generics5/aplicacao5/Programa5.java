package aplicacao5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa5 {

	public static void main(String[] args) {
		
		//princ�pio get/put
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		//fun�ao copy recebendo uma lista especifica que copia para uma lista mais gen�rica
		copy(myInts, myObjs);
		
		printList(myObjs);
		
		copy(myDoubles, myObjs);

		printList(myObjs);
	}
	
	//definicao do m�todo copy
	//*****ORIGEM******* m�todo copy que recebe uma lista de qualquer tipo que extende  TIPO DE number (List<? extends Number> origem,)
	//*****DESTINO****** m�todo copy que COPIA uma lista de qualquer tipo SUPER TIPO number (List<? super Number> destino)
	//m�todo copy que 
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		//para cada number number da lista de origem (covariancia) Acessa os elementos
		for (Number number : origem) {
			//a lista de destino adiciona elementos para lista de destino (contravariancia) Adiciona os elementos
			destino.add(number);
		}
	}
		
		
		//m�todo para imprimir 
		public static void printList(List<?> list) {
			//para cada objeto da lista
			for (Object obj : list) {
				System.out.print(obj + " ");
		}
			System.out.println();
	}

}
