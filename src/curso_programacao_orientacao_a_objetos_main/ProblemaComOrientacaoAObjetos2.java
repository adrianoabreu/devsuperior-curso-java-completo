package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Produto;

public class ProblemaComOrientacaoAObjetos2 {
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
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
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
