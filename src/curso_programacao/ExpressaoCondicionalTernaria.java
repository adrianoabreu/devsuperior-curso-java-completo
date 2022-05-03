package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	/*
	 * Expressão condicional ternária possui a mesma função do if-else.
	 *    variável = (condição) ? verdadeiro : falso
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: " + desconto);
		
		sc.close();
	}

}
