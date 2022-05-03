package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Produto6;

public class ProblemaVetores2 {
	/*
	 * Fazer um programa para ler um número inteiro N e os dados (nome e
	 * preço) de N Produtos. Armazene os N produtos em um vetor. Em
	 * seguida, mostrar o preço médio dos produtos.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto6[] vetor = new Produto6[n];
		
		//for(int i = 0; i < n; i++) {
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome  = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto6(nome, preco);
		}
		
		double soma = 0.0;
		//for(int i = 0; i < n; i++) {
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		//double media = soma / n;
		double media = soma / vetor.length;
		
		System.out.printf("Media: %.2f", media);
		
		sc.close();
		
	}

}
