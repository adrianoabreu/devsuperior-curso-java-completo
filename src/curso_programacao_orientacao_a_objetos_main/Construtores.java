package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Produto2;

public class Construtores {
	/*
	 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
	 * quantidade no estoque). Em seguida:
	 * • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
	 *   estoque)
	 * • Realizar uma entrada no estoque e mostrar novamente os dados do produto
	 * • Realizar uma saída no estoque e mostrar novamente os dados do produto
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		Produto2 produto = new Produto2(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		sc.close();
	}

}
