package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_util.Calculator2;

public class ProblemaMembrosEstaticosVersao3 {
	/*
	 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar
	 * quanto seria o valor de uma circunferência e do volume de uma esfera
	 * para um raio daquele valor. Informar também o valor de PI com duas
	 * casas decimais.
	 * 
	 * • Versão 3: classe Calculator2 com método estático.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator2.circumference(radius);
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
		
		sc.close();
	}

}
