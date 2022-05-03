package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeAtribuicaoAcumulativa {
	/*
	 * Uma operadora de telefonia cobra 50.00 por um plano básico que
	 * dá direito a 100 minutos de telefone. Cada minuto que exceder a
	 * franquia de 100 minutos custa 2.00. Fazer um programa para ler a 
	 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor 
	 * a ser pago.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double plano = 50.00;
		int minutos  = sc.nextInt();
				
		if(minutos > 100) {
			//plano = plano + (minutos - 100) * 2; // Sem operador de atribuição acumulativa += .
			plano += (minutos - 100) * 2;        // Com operador de atribuição acumulativa += .
		}
		
		System.out.printf("Valor a pagar = R$ %.2f", plano);
		
		sc.close();
		

	}

}
