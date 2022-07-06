package aplicacao1;

import java.util.Scanner;

import servicos1.ServicoImpressao1;

public class Programa1 {

	public static void main(String[] args) {

		/*
		 * Deseja-se fazer um programa que leia uma quantidade N e depois N números
		 * inteiros. Ao final, imprima esses números de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 */

		Scanner sc = new Scanner(System.in);

		// instanciar ServiçoImpressao
		ServicoImpressao1<Integer> sImpressao = new ServicoImpressao1<Integer>();

		System.out.print("Digite a quantidade de elementos(N): ");
		int n = sc.nextInt();

		// for para leitura dos valores
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor: ");
			Integer valores = sc.nextInt();
			// esse valor sera adicionado com addValor
			sImpressao.addValor(valores);
		}
		// impressao dos valores na tela
		sImpressao.print();
		// primeiro valor adicionado(s/casting)
		Integer x = sImpressao.first();
		System.out.println("Primeiro elementos digitado: " + x);

		// _____________________________________________________

		ServicoImpressao1<String> sImpressao2 = new ServicoImpressao1<String>();

		System.out.print("Digite a quantidade de elementos(N): ");
		int n2 = sc.nextInt();

		// for para leitura dos valores
		for (int i = 0; i < n2; i++) {
			System.out.println("Digite o valor: ");
			String valores = sc.next();
			// esse valor sera adicionado com addValor
			sImpressao2.addValor(valores);
		}
		// impressao dos valores na tela
		sImpressao2.print();
		// primeiro valor adicionado(s/casting)
		String x2 = sImpressao2.first();
		System.out.println("Primeiro elemento digitado: " + x2);

		sc.close();

	}

}
