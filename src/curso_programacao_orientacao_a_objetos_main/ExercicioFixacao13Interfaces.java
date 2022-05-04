package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Contrato;
import curso_programacao_orientacao_a_objetos_entidades.Parcelas;
import curso_programacao_orientacao_a_objetos_servicos.ServicoDeContrato;
import curso_programacao_orientacao_a_objetos_servicos.ServicoDePagamentoOnline;
import curso_programacao_orientacao_a_objetos_servicos.ServicoPaypal;

public class ExercicioFixacao13Interfaces {
	/*
	 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
	 * um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
	 * número de meses desejado.
	 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
	 * Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
	 * por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
	 * juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
	 * Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
	 * e valor total do contrato). Em seguida, o programa deve ler o número de meses para
	 * parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
	 * sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
	 * meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
	 * 
	 * VIDEO AULA DA SOLUÇÃO
	 * https://www.youtube.com/watch?v=-_ObFKxG30Q
	 * 
	 */
	public static void main(String[] args) throws ParseException{
		
		// TESTANDO O SERVICO DE PAGAMENTO ONLINE COM SERVICO PAYPAL FAZENDO UPCASTING:
		//ServicoDePagamentoOnline spo = new ServicoPaypal();
		//System.out.println("Taxa de pagamento Paypal retornada: " + spo.taxaDePagamento(200.00));
		//System.out.println("Juros Paypal retornado:             " + spo.jurosMensal(200.00, 3));
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero do Contrato: ");
		Integer numero = sc.nextInt();
		System.out.print("Data do Contrato: ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor Total do Contrato: ");
		Double valor = sc.nextDouble();
			
		Contrato contrato = new Contrato(numero,data,valor);
		
		ServicoDeContrato servicoContrato = new ServicoDeContrato(new ServicoPaypal());
		
		System.out.println();
		System.out.print("Quantidade de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		servicoContrato.processarContrato(contrato, parcelas);
		
		System.out.println();
		System.out.println("PARCELAS:");
		for(Parcelas parcela : contrato.getLista()) {
			System.out.println(parcela);
		}
		
		sc.close();

	}

}
