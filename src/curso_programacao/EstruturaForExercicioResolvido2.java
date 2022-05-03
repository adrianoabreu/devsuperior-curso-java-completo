package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForExercicioResolvido2 {
	/*
	 * Leia 2 valores X e Y. A seguir, calcule e mostre a soma dos números ímpares entre eles.
	 * 
	 * Entrada:
	 * o arquivo de entrada contém dois valores inteiros.
	 * 
	 * Saída:
	 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores
	 * fornecidos na entrada que deverá caber em um inteiro.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		
		if(x < y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		
		for(int i = min + 1; i < max; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("Soma dos ímpares: " + soma);
		
		sc.close();

	}

}
