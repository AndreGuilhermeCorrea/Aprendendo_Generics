package aplicacao4;

import java.util.Arrays;
import java.util.List;

public class Programa4 {

	// Tipos curinga (wildcard types)
	// Generics são invariantes

	// List< Object > não é o supertipo de qualquer tipo de lista

	// O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga.

	// Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer
	// tipo":

	//imprime qualquer tipo de lista usando o tipo curinga
	
	
	
	//ENTRETANTO NÃO É POSSÍVEL ADICIONAR ITENS A UMA LISTA TIPO CURINGA**************
	//O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.**************
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Pedro", "Alvez", "Dunha");
		printList(myStrs);
		}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
