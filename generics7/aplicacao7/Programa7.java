package aplicacao7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entidades7.Produto7;

public class Programa7 {

	
	/*
	 * Set<T> �
	 * 
	 * Representa um conjunto de elementos (similar ao da �lgebra) 
	 * � N�o admite repeti��es 
	 * � Elementos n�o possuem posi��o 
	 * � Acesso, inser��o e remo��o de elementos s�o r�pidos 
	 * � Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a. 
	 * � Principais implementa��es: 
		 * � HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado 
		 * � TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo compareTo do  objeto (ou Comparator) 
		 * � LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
	 */

	/*
	 * Alguns m�todos importantes
	 * 
		 * � add(obj), remove(obj), contains(obj) 
		 * � Baseado em equals e hashCode 
		 * � Se equals e hashCode n�o existir, � usada compara��o de ponteiros 
		 * � clear() 
		 * � size() 
		 * � removeIf(predicate)
		 * � addAll(other) - uni�o: adiciona no conjunto os  elementos do outro conjunto, sem repeti��o 
		 * � retainAll(other) - interse��o:  remove do conjunto os elementos n�o contitos em other 
		 * � removeAll(other) - diferen�a: remove do conjunto os elementos contidos em other
	 */
	
	public static void main(String[] args) {
	
				
				Set<String> set = new HashSet<>();
				
				set.add("Acucar");
				set.add("Arroz");
				set.add("Feijao");
				
				System.out.println(set.contains("Feijao"));
				
					for (String p : set) {
						
						System.out.println(p);
					}
					
					
					Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
					
					Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
					
					// UNI�O
					Set<Integer> c = new TreeSet<>(a);
					c.addAll(b);
					System.out.println(c);
					
					// INTERCE��O
					Set<Integer> d = new TreeSet<>(a);
					d.retainAll(b);
					System.out.println(d);
					
					// DIFEREN�A
					Set<Integer> e = new TreeSet<>(a);
					e.removeAll(b);
					System.out.println(e);
					
					
					
					
				System.out.println("______________________");
				System.out.println("Teste Igualdade Como as cole��es Hash");
				
				/*		� Como as cole��es Hash testam igualdade?
				 * 
					 * Se hashCode e equals estiverem implementados:
					 * 
					� Primeiro hashCode. Se der igual, usa equals para confirmar.
					� Lembre-se: String, Integer, Double, etc. j� possuem equals e hashCode
					� Se hashCode e equals N�O estiverem implementados:
					� Compara as refer�ncias (ponteiros) dos objetos.
				*/
			
								
				Set<Produto7> Set = new HashSet<>();
				
				
				
				
				Set.add(new Produto7("TV ", 900.0));
				Set.add(new Produto7("Notebook ", 1200.0));
				Set.add(new Produto7("Tablet ", 400.0));
				
				//comparacao feita por conte�do e nao por ponteiro de objetos deve se implementar os hashcode e equalscode
				
				Produto7 prod7 = new Produto7("Notebook ", 1200.0);
				System.out.println(Set.contains(prod7));
				
				Set<Produto7> Set1 = new TreeSet<>();
				
				Set1.add(new Produto7("Azeitona ", 900.0));
				Set1.add(new Produto7("Milho ", 1200.0));
				Set1.add(new Produto7("Ervilha ", 400.0));

				
				for(Produto7 prod7_1 : Set1) {
					System.out.println(prod7_1);
				}
				
				
	}
	


}
