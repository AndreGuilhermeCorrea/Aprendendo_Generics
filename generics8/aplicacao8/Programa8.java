package aplicacao8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entidades8.Produtos8;

public class Programa8 {

	

		// MAP

		/*
		 * � � uma cole��o de pares chave / valor � N�o admite repeti��es do objeto
		 * chave � Os elementos s�o indexados pelo objeto chave (n�o possuem posi��o) �
		 * Acesso, inser��o e remo��o de elementos s�o r�pidos � Uso comum: cookies,
		 * local storage, qualquer modelo chave-valor � Principais implementa��es: �
		 * HashMap - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado �
		 * TreeMap - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado
		 * pelo compareTo do objeto (ou Comparator) � LinkedHashMap - velocidade
		 * intermedi�ria e elementos na ordem em que s�o adicionados
		 * 
		 * � put(key, value), remove(key), containsKey(key), get(key) � Baseado em
		 * equals e hashCode � Se equals e hashCode n�o existir, � usada compara��o de
		 * ponteiros � clear() � size() � keySet() - retorna um Set<K> � values() -
		 * retornaa um Collection<V>
		 */
	public static void main(String[] args) {
		
		
		
		//MODELO 1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		System.out.println("MODELO 1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Nome", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("Telefone Contato", "99771122");
		cookies.remove("email");
		cookies.put("Telefone Contato", "99771133");
		
		//ver se contem a chave
		System.out.println("Contem a Key 'Telefone Contato' no MAP?: " + cookies.containsKey("Telefone Contato"));
		//acessar no map o valor de uma chave
		System.out.println("Telefone Contato numero: " + cookies.get("Telefone Contato"));
		//teste para pegar valor inexistente(quando o elemento nao existe o m�todo retorna null)
		System.out.println("Email: " + cookies.get("email"));
		//size para ver o tamanho do map ou a quantidade de elementos
		System.out.println("Tamanho: " + cookies.size());
		//
		System.out.println("ALL COOKIES:");
				for (String key : cookies.keySet()) {
					System.out.println(key + ": " + cookies.get(key));
					
					
					
					
					//MODELO 2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
					
					System.out.println("MODELO 2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
					
					Map<Produtos8, Double> estoque = new HashMap<>();
					Produtos8 p1 = new Produtos8("Caneta", 900.0);
					Produtos8 p2 = new Produtos8("Borracha", 1200.0);
					Produtos8 p3 = new Produtos8("Calculadora", 400.0);
					
					//quantidade do estoque de cada um dos produtos
					estoque.put(p1, 10000.0);
					estoque.put(p2, 20000.0);
					estoque.put(p3, 15000.0);
					
					//inserindo o produto no estoque
					Produtos8 ps = new Produtos8("Caneta", 900.0);
					
					System.out.println("Contem a Key 'ps' no MAP? : " + estoque.containsKey(ps));
					
					
					
				}
		}
		

}
