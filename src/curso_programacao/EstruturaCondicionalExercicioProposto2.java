package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto2 {
	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0 || numero == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
