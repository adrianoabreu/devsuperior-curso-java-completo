package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto5 {
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
	 * seguir, calcule e mostre o valor da conta a pagar.
	 * 
	 * CODIGO   ESPECIFICAÇÃO      PREÇO
	 * 1        Cachorro Quente    R$ 4.00
	 * 2        X-Salada           R$ 4.50
	 * 3        X-Bacon            R$ 5.00
	 * 4        Torrada simples    R$ 2.00
	 * 5        Refrigerante       R$ 1.50
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo     = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = 0.00;
		
		if(codigo == 1) {
			valor = (double) quantidade * 4.00;
		}else if(codigo == 2) {
			valor = (double) quantidade * 4.50;
		}else if(codigo == 3) {
			valor = (double) quantidade * 5.00;
		}else if(codigo == 4) {
			valor = (double) quantidade * 2.00;
		}else if(codigo == 5){
			valor = (double) quantidade * 1.50;
		}
		
		System.out.printf("TOTAL: R$ %.2f", valor);
		sc.close();

	}

}
