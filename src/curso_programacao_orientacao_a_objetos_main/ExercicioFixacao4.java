package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_util.CurrencyConverter;

public class ExercicioFixacao4 {
	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
	 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
	 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
	 * para ser responsável pelos cálculos.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos dolares deseja comprar: ");
		double dolares = sc.nextDouble();
				
		System.out.printf("Valor a ser pago em reais: %.2f", CurrencyConverter.calculoConversao(cotacao, dolares));
		
		sc.close();
		
	}

}
