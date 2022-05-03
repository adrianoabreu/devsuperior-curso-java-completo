package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioProposto2 {
	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
	 *casas decimais.
	 *Fórmula da área: area = pi . raio ao quadrado
	 *Considere o valor de pi = 3.14159
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi   = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (Math.pow(raio, 2)); //(Math.pow(raio, 2) representa raio ao quadrado.
		
		System.out.println("Entrada:                       Saida:");
		System.out.printf("%.2f", raio);
		System.out.printf("                           %.4f", area);
		
		sc.close();
		
	}

}
