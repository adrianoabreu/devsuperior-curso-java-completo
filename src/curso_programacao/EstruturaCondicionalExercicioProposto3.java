package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto3 {
	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	 * ordem crescente ou decrescente.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("SAO MULTIPLOS");
		}else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();

	}

}
