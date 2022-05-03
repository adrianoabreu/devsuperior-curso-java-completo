package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoMatriz {
	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de
	 * ordem N contendo números inteiros. Em seguida, mostrar a diagonal
	 * principal e a quantidade de valores negativos da matriz.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];  //alocando uma matriz
		
		for(int i=0; i < matriz.length; i++) {           //for que representa linha
			for(int j=0; j < matriz[i].length; j++) {    //for que representa coluna
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Exibindo a diagonal principal
		System.out.println("Diagonal principal: ");
		for(int i=0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		//Contando os numeros negativos existentes na matriz.
		int count = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Quantidade de numeros negativos: " + count);
		
		sc.close();
		
	}

}
