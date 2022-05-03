package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto1 {
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}

}
