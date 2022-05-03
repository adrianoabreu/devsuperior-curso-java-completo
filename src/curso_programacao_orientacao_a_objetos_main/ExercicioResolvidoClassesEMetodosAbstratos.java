package curso_programacao_orientacao_a_objetos_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Circulo;
import curso_programacao_orientacao_a_objetos_entidades.Forma;
import curso_programacao_orientacao_a_objetos_entidades.Retangulo2;
import curso_programacao_orientacao_a_objetos_entidades_enums.Cor;

public class ExercicioResolvidoClassesEMetodosAbstratos {
	/*
	 * Fazer um programa para ler os dados de N figuras (N fornecido
	 * pelo usuário), e depois mostrar as áreas destas figuras na
	 * mesma ordem em que foram digitadas.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de Formas Geométricas: ");
		int n = sc.nextInt();
		
		// A lista declarada tem que ser da superclasse para realizar polimorfismo e herança.
		List<Forma> lista = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados da forma " + i);
			System.out.print("Retangulo ou Circulo (r/c) ? ");
			char forma = sc.next().charAt(0);
			System.out.print("Cor (PRETA/AZUL/VERMELHA) ? ");
			Cor cor = Cor.valueOf(sc.next());
			if(forma == 'r') {
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				lista.add(new Retangulo2(cor, largura, altura));
			}else {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas das Formas: ");
		for(Forma f : lista) {
			System.out.println(String.format("%.2f", f.area())); // o metodo area() possui polimorfismo, pois seu calculo depende do tipo de objeto instanciado e adicionado a lista de Forma.
		}
		
		sc.close();
		
	}

}
