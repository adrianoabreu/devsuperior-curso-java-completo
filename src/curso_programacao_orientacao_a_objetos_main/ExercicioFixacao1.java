package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Retangulo;

public class ExercicioFixacao1 {
	/*
	 * Fazer um programa para ler os valores da largura e altura
	 * de um retângulo. Em seguida, mostrar na tela o valor de
	 * sua área, perímetro e diagonal. Usar uma classe como
	 * mostrado no projeto ao lado.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre com a largura e altura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura  = sc.nextDouble();
		
		retangulo.area();
		retangulo.perimetro();
		retangulo.diagonal();
		
		System.out.println(retangulo);
		
		sc.close();
		
	}

}
