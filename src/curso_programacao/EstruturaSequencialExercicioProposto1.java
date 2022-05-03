package curso_programacao;

import java.util.Scanner;

public class EstruturaSequencialExercicioProposto1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
         * mensagem explicativa, conforme exemplo.
         * 
         * Entrada: Saída:
         * 10       SOMA = 40
         * 30              
		 */
		
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		System.out.println("______________________________________________________________");
		System.out.println("|Entrada:                        |Saida:                      |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("|" + valor1 + "                              |SOMA: " + soma + "                    |");
		System.out.println("|" + valor2 + "                               |                            |");
		System.out.println("|_____________________________________________________________|");
		
		sc.close();

	}

}
