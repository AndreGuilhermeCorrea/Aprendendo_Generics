package aplicacao4;

import java.util.Arrays;
import java.util.List;

public class Programa4 {

	// Tipos curinga (wildcard types)
	// Generics s�o invariantes

	// List< Object > n�o � o supertipo de qualquer tipo de lista

	// O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga.

	// Com tipos curinga podemos fazer m�todos que recebem um gen�rico de "qualquer
	// tipo":

	//imprime qualquer tipo de lista usando o tipo curinga
	
	
	
	//ENTRETANTO N�O � POSS�VEL ADICIONAR ITENS A UMA LISTA TIPO CURINGA**************
	//O compilador n�o sabe qual � o tipo espec�fico do qual a lista foi instanciada.**************
	
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
