package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresBitwise {
	/*
	 * Aplica-se Operadores bitwise em programação de baixo nível como micro controlador, programação de 
	 * interface com redes, arduínos, etc.
	 */
	public static void main(String[] args) {
		/*
		* int n1 = 89;
		* int n2 = 60;
		* System.out.println(n1 & n2);
		* System.out.println(n1 | n2);
		* System.out.println(n1 ^ n2);
		*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		sc.close();
		
	}

}
