package curso_programacao_orientacao_a_objetos_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Funcionario3;
import curso_programacao_orientacao_a_objetos_entidades.Terceirizado;

public class ExercicioResolvidoPolimorfismo {
	/*
	 * Uma empresa possui funcionários próprios e terceirizados.
	 * Para cada funcionário, deseja-se registrar nome, horas
	 * trabalhadas e valor por hora. Funcionários terceirizado
	 * possuem ainda uma despesa adicional.
	 * 
	 * O pagamento dos funcionários corresponde ao valor da hora
	 * multiplicado pelas horas trabalhadas, sendo que os
	 * funcionários terceirizados ainda recebem um bônus
	 * correspondente a 110% de sua despesa adicional.
	 * 
	 * Fazer um programa para ler os dados de N funcionários (N
	 * fornecido pelo usuário) e armazená-los em uma lista. Depois
	 * de ler todos os dados, mostrar nome e pagamento de cada
	 * funcionário na mesma ordem em que foram digitados.
	 * 
	 * Construa o programa conforme projeto ao lado. Veja
	 * exemplo na próxima página.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de Funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario3> lista = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do Funcionário " + i);
			System.out.print("Terceirizado (y/n) ? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();

			if(tipo == 'y') {
				System.out.print("Valor da despesa: ");
				Double valorDespesa = sc.nextDouble();
				lista.add(new Terceirizado(nome, horas, valorPorHora, valorDespesa));
			}else {
				lista.add(new Funcionario3(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Funcionario3 f : lista) {
			System.out.println(f.getNome() + " - " + String.format("%.2f",f.pagamento()));
		}
		
		sc.close();
	}

}
