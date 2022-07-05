package aplicacao2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Servicos2.ServicoCalcular2;
import entidades2.Produtos2;

public class Programa2 {

	public static void main(String[] args) {
		/*
		 * Uma empresa de consultoria deseja avaliar a performance de produtos,
		 * funcionários, dentre outras coisas. Um dos cálculos que ela precisa é
		 * encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia
		 * um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
		 * mostre o mais caro deles.
		 */

		// Nota: Java possui: Collections.max(list)(para encontrar o maior elemento na lista

		Locale.setDefault(Locale.US);
		
		//lista de tipo generico
		List<Produtos2> list = new ArrayList<>();

		//caminho do arquivo
		String path = "D:\\\\workSpace\\\\WorkSpace Generics\\generics2\\Generics2.txt";
		
		//abre o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			//leitura das linhs do arquivo
			String line = br.readLine();
			//enquanto for diferente de nulo(vazio)
			while (line != null) {
				//vetor de strings recebendo a linha do arquivo baseado no caractere (,) 
				//o split recortara cada pedaço de string entre as virgulas(nome e preco) e inserindo no vetor
				String[] fields = line.split(",");
				//adicionar na lista e instanciar o produto passando o nome (fields[0]) e...
				//valor convertido para double (Double.parseDouble(fields[1]))
				list.add(new Produtos2(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			//(.max(list);)operação responsavel por encontrar o maior elemento 
			//produto x recebendo o maior valor dessa lista (ServicoCalcular2 adaptado para qualquer tipo e nao somente inteiro)
			Produtos2 x = ServicoCalcular2.max(list);
			//impressao do maior valor na tela
			System.out.println("Maior Valor:");	System.out.println(x);
			
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
