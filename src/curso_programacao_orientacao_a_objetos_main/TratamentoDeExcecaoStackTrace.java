package curso_programacao_orientacao_a_objetos_main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecaoStackTrace {

	public static void main(String[] args) {
		
		metodo1();
		System.out.println("Fim do programa");
	}
	
	public static void metodo1() {
		System.out.println("*** INICIO METODO1 ***");
		metodo2();
		System.out.println("*** FIM METODO1 ***");
	}
	
	public static void metodo2() {
		System.out.println("*** INICIO METODO2 ***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de Input!");
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("*** FIM METODO2 ***");
	}

}
