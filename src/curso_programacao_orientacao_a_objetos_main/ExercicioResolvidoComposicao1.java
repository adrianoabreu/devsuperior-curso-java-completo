package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Departamento;
import curso_programacao_orientacao_a_objetos_entidades.HorasDeContrato;
import curso_programacao_orientacao_a_objetos_entidades.Trabalhador;
import curso_programacao_orientacao_a_objetos_entidades_enums.NivelDoTrabalhador;

public class ExercicioResolvidoComposicao1 {
	/*
	 * É um tipo de associação que permite que um objeto contenha outro
	 * 
	 * Relação "tem-um" ou "tem-vários"
	 * 
	 * Vantagens
	 *	• Organização: divisão de responsabilidades
	 *	• Coesão
	 *	• Flexibilidade
	 *	• Reuso
	 *	
	 * Nota: embora o símbolo UML para composição (todo-parte) seja o diamante
	 * preto, neste contexto estamos chamando de composição qualquer associação
	 * tipo "tem-um" e "tem-vários".
	 * 
	 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
	 * do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
	 * (próxima página).
	 */
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do Departamento: ");
		String departamento = sc.nextLine();
		
		System.out.println("Entre com os dados do Trabalhador");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.next();
		System.out.print("Salário Base: ");
		double salario = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nome, NivelDoTrabalhador.valueOf(nivel), salario, new Departamento(departamento));
		
		System.out.print("Quantos contratos para esse Trabalhador? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do contrato " + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int duracao = sc.nextInt();
			HorasDeContrato contrato = new HorasDeContrato(data, valor, duracao);
			trabalhador.adicionarContratos(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com mês e ano para calcular o salario(MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda Total em " + mesAno + ": " + String.format("%.2f", trabalhador.rendaTotal(mes, ano)));
		
		sc.close();
		
		
	}

}
