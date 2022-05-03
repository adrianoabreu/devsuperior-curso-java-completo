package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioResolvido2 {
	/*
	 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a 
	 * idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
	 * de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
	 * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idade           = sc.nextInt();
		double media        = 0.0;
		int quantidadeLidos = 0;
		int idadeSomada     = 0;

		while(idade >= 0) {
			quantidadeLidos += 1;
			idadeSomada     += idade;
			idade           = sc.nextInt();			
		}
		
		if(quantidadeLidos > 0) {
			media = (double) idadeSomada / quantidadeLidos;
			System.out.printf("Idade Media = %.2f", media);
		}else {
			System.out.println("impossivel calcular");
		}

		sc.close();
	}

}
