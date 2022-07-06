package aplicacao6;

import entidades6.Clientes6;

public class Programa6 {

	public static void main(String[] args) {
		/*
		 * hashCode e equals
		 * 
		 * São operações da classe Object utilizadas para comparar se um objeto é igual
		 * a outro • equals: lento, resposta 100% • hashCode: rápido, porém resposta
		 * positiva não é 100% • Tipos comuns (String, Date, Integer, Double, etc.) já
		 * possuem implementação para essas operações. Classes personalizadas precisam
		 * sobrepô-las
		 * 
		 * 
		 * 
		 * Equals
		 * 
		 * Método de igualdade que compara se o objeto é igual a outro, retornando true ou false.
		 */

		String a = "Maria";
		String b = "Alex";
		System.out.println("equals " + a.equals(b));
		// string a nao é igual o string b

		/*
		 * HashCode
		 
		 * Método de igualdade extremamente rapido que retorna um número inteiro representando um código gerado a partir
		 * das informações do objeto 
		 * 
		 */

		String a1 = "Maria";
		String a2 = "Maria";
		String b1 = "Alex";
		System.out.println("hashCode " + a1.hashCode());
		System.out.println("hashCode " + a2.hashCode());
		System.out.println("hashCode " + b1.hashCode());

		Clientes6 c1 = new Clientes6("Andre", "de_correa@msn.com");
		Clientes6 c2 = new Clientes6("Fabiano", "Fabiano_correa@msn.com");
		Clientes6 c3 = new Clientes6("Gordim", "Gordim_correa@msn.com");
		Clientes6 c4 = new Clientes6("Andre", "de_correa@msn.com");
		
		
		
		System.out.println("Teste equals + hashCode");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println("Igualdade " + c1.equals(c2));
		System.out.println("Igualdade " + c1.equals(c3));
		System.out.println("Igualdade " + c3.equals(c2));
		System.out.println("Igualdade " + c1.equals(c4));
		
		//igualdade 
		System.out.println("Teste equals + hashCode com objetos iguais: " + c1.equals(c4));
		//igualdade usando == dará resultado falso pois estao alocados em posiçoes diferentes na memória HEAP
		System.out.println("Igualdade com == " + (c1 == c4));
		
		//igualdade usando == dará resultado verdadeiro pois o compilador trata a expressão literal de forma diferente 
		System.out.println("Igualdade com == " + (a1 == a2));
		
		
		
		
	}

}
