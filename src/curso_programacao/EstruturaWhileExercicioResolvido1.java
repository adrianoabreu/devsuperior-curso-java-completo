package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioResolvido1 {
	/*
	 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem
	 * que indique se estes valores foram digitados em ordem crescente ou decrescente.
	 * 
	 * ENTRADA:
	 * A entrada contém vários casos de teste. Cada caso contém dois valores intiros X e Y. A leitura deve ser encerrada
	 * ao ser fornecido valores iguais para X e Y.
	 * 
	 * SAÍDA:
	 * Para cada caso de teste imprima "Crescente", caso os valores tenham sido digitados na ordem crescente, caso
	 * contrário imprima a mensagem "Decrescente".
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			System.out.println((x < y) ? "Decrescente" : "Crescente"); // utilizando condicional ternária
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
