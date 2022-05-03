package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForExercicioProposto6 {
	/*
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
			 
		}
		
		sc.close();
		
	}

}
