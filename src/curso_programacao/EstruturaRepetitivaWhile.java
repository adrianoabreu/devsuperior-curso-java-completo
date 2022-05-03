package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {
	/*
	 * Fazer um programa que lê números
	 * inteiros até que um zero seja lido. Ao
	 * final mostra a soma dos números lidos.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
		int soma = num ;
		
		while (num != 0) {
			num = sc.nextInt();
			soma += num;			
		}
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}
