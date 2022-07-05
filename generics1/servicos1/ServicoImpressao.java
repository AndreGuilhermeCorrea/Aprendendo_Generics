package servicos1;

import java.util.ArrayList;
import java.util.List;

//classe generica

public class ServicoImpressao<T> {

	//lista do tipo t usando Generic
	private List<T> list = new ArrayList<>();
	
	
	//operacao que recebe um valor do tipo t e adiciona na lista
	public void addValor(T valor) {
		list.add(valor);
	}

	//operacao que devolve primeiro elemento do tipo t armazenado no ServicoImpressao
	public T first() {
		//programaçao defensiva
		if (list.isEmpty()) {
			//trtamento da excecao caso lista vazia
			throw new IllegalStateException("Erro!!! Lista Vazia!!!");
		}
		//caso contrario o primeiro elemento da lista sera retornado
		return list.get(0);
	}

	//logica para impressão da lista
	public void print() {
		//abre colchetes
		System.out.print("[");
		//teste para saber se a lista vazia
		if (!list.isEmpty()) {
			//impressão do primeiro elemento
			System.out.print(list.get(0));
		}
		//for para segundo elemento em diante 
		for (int i = 1; i < list.size(); i++) {
			//será impresso uma virgula e um espaco e o proximo elemento
			System.out.print(", " + list.get(i));
		}
		//fecha colchetes
		System.out.println("]");
	}
}