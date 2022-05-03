package curso_programacao;

import java.util.Scanner;

public class EstruturaSequencialExercicioProposto3 {
	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
	 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).     
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("Entrada:                       Saida:");
		System.out.println(a + "                              DIFERENCA: " + diferenca);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		sc.close();
	}

}
