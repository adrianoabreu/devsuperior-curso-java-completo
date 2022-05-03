package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioProposto4 {
	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	 * decimais.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int    numeroFuncionario = sc.nextInt();
		int    horasTrabalhadas  = sc.nextInt();
		double valorPorHora      = sc.nextDouble();
		
		double salario           = horasTrabalhadas * valorPorHora;
		
		System.out.println("Entrada:                        Saida:");
		System.out.println(numeroFuncionario + "                               NUMBER: " + numeroFuncionario);
		System.out.print(horasTrabalhadas + "             ");
		System.out.printf("                SALARY: %.2f\n" , salario);
		System.out.printf("%.2f", valorPorHora);
		
		
		sc.close();
		
	}

}
