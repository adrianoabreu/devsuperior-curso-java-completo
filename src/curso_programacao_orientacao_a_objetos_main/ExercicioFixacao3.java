package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Aluno;

public class ExercicioFixacao3 {
	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
	 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
	 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
	 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
	 * resolver este problema.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.nome  = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTANDO %.2f PONTOS\n", aluno.pontosFaltantes());
		}else {
			System.out.println("APROVADO");
		}
		
		sc.close();
		
	}

}
