package curso_programacao_orientacao_a_objetos_main;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Contribuinte;
import curso_programacao_orientacao_a_objetos_entidades.PessoaFisica;
import curso_programacao_orientacao_a_objetos_entidades.PessoaJuridica;

public class ExercicioFixacao11ClassesEMetodosAbstratos {
	/*
	 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
	 * podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
	 * bem como o total de imposto arrecadado.
	 * 
	 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
	 * são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
	 * seguintes:
	 * 
	 * Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
	 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
	 * destes gastos são abatidos no imposto.
	 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
	 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
	 * 
	 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
	 * funcionários, ela paga 14% de imposto.
	 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
	 * 400000 * 14% = 56000.00
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de Contribuíntes: ");
		int n = sc.nextInt();
		
		List<Contribuinte> lista = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do Contribuinte " + i);
			System.out.print("Pessoa Física ou Jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a renda anual: ");
			double renda = sc.nextDouble();
			if(tipo == 'f') {
				System.out.print("Digite o valor dos gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, gastoSaude));
			}else {
				System.out.print("Digite o número de funcionários: ");
				int numeroFunc = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, numeroFunc));
			}
		}
		
		Double soma = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for(Contribuinte c : lista) {
			Double imposto = c.calcularImposto();
			System.out.println(c.getNome() + " $ " + String.format("%.2f", imposto));
			soma += imposto;
		}
		
		System.out.println();
		System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", soma));
		
		sc.close();
	}

}
