package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Cliente;
import curso_programacao_orientacao_a_objetos_entidades.ItemDoPedido;
import curso_programacao_orientacao_a_objetos_entidades.Pedido3;
import curso_programacao_orientacao_a_objetos_entidades.Produto7;
import curso_programacao_orientacao_a_objetos_entidades_enums.StatusDoPedido;

public class ExercicioFixacao9EnumComposicao {
	/*
	 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
	 * sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
	 * o instante do sistema: new Date()
	 */
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente:");
		System.out.print("Nome: " );
		String nome  = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário: ");
		Date data = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome,email,data);
		
		System.out.println("Entre com os dados do Pedido:");
		System.out.print("Status: ");
		String status = sc.next();
		Pedido3 p3 = new Pedido3(new Date(), StatusDoPedido.valueOf(status), cliente);
		
		System.out.print("Quantos itens para o pedido? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do Item " + i);
			System.out.print("Nome do Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preço do Produto: ");
			double precoProduto = sc.nextDouble(); 
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			// Instanciando as classes:
			Produto7 produto = new Produto7(nomeProduto, precoProduto);
			ItemDoPedido item = new ItemDoPedido(quantidade, precoProduto, produto);
			
			p3.adicionaItem(item);
		}
		
		System.out.println(p3);
		
		sc.close();
		
	}

}
