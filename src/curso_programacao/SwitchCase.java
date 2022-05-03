package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
	/*
	 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um
	 * dia da semana (sendo 1 = domigo, 2 = segunda, e assim por diante).
	 * Escrever na tela o dia da semana correspondente.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		String dia;
		
		switch(numero) {
			case 1:
				dia = "Domingo";
				break;
				
			case 2:
				dia = "Segunda";
				break;
				
			case 3:
				dia = "Terça";
				break;
			
			case 4:
				dia = "Quarta";
				break;
				
			case 5:
				dia = "Quinta";
				break;
				
			case 6:
				dia = "Sexta";
				break;
				
			case 7:
				dia = "Sabado";
				break;
			default:
				dia = "Valor inválido";
		}
		
		System.out.println("Dia de semana: " + dia);
		
		sc.close();
		

	}

}
