package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioProposto5 {
	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo1           = sc.nextInt();
		int numeroDePecas1    = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		int codigo2           = sc.nextInt();
		int numeroDePecas2    = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double valorPago = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: %.2f", valorPago);
		
		sc.close();
	}

}
