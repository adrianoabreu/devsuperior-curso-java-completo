package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioResolvido1 {
	/*
	 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
	 * segundo semestres de uma disciplina anual. Ems eguida, mostrar a nota final que o
	 * aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
	 * seja inferior a 60.00, mostrar a mensagem "REPROVADO". Todos os valores devem ter uma casa decimal
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("Nota 1: %.1f\n", nota1);
		System.out.printf("Nota 2: %.1f\n", nota2);
		System.out.printf("Nota Final: %.1f\n", media);		
		
		if(media < 60.00) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}

}
