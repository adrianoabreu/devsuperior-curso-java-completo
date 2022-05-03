package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetores {
	/*
	 * Fazer um programa para ler um número inteiro N e a altura de N
	 * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
	 * altura média dessas pessoas.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma= 0.0;
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("A media de altura é: %.2f", media);
		
		sc.close();
		
	}

}
