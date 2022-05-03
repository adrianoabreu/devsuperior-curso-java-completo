package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesProblemaExemplo {
	/*
	 * Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
	 * 
	 * Enter three numbers:
	 * 5
	 * 8
	 * 3
	 * Higher = 8
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		sc.close();
		
	}
	public static int max(int x, int y, int z) {
	
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
