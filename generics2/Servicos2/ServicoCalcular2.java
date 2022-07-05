package Servicos2;

import java.util.List;

public class ServicoCalcular2 {
	
	//m�todo max adaptado (GENERICS)
	//opera��o estatica sem a necessidade de instancia-la
	//adaptado para qualquer tipo e nao somente inteiro
	//m�todo que vai trabalhar com algum tipo t desde que o t seja qualquer tipo de (Comparable<T>>)	
	public static
			//para que o compareTo nao apresente erro esse deve ser especificado no topo do metodo com( T extends Comparable<T> )
			//Comparable<? super T>> tipo t ou qualquer tipo super classe de t (produto ou qualquer super classe produto)((tipos curinga))
			<T extends Comparable<? super T>>
				T max(List<T> list) {
		//programa��o defenciva caso a lista seja vazia
		if (list.isEmpty()) {
			//lancando uma exce��o
			throw new IllegalStateException("A lista n�o pode estar vazia!!!");
		}
		//algoritmo para encontrar o maior elemento
		T max = list.get(0); //list.get(0); primeiro elemento da lista
		for (T item : list) {
			//comparando se cada item dessa lista � maior que o max compareTo 1�Objeto com o outro objeto
			//para que o compareTo nao apresente erro esse deve ser especificado no topo do metodo com( T extends Comparable<T> )
			if (item.compareTo(max) > 0) {
				//maior elemento da lista
				max = item;
			}
		}
		//retorna
		return max;
	}
}