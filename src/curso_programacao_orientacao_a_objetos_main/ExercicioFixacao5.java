package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.ContaBancaria;

public class ExercicioFixacao5 {
	/*
	 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
		titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
		inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
		conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
		
		Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
		o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
		exemplo).
		
		Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
		isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
		realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
		suficiente para realizar o saque e/ou pagar a taxa.
		
		Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
		informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
		mostrando os dados da conta após cada operação.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial? (s/n):  ");
		char opcao = sc.next().charAt(0);
		
		double deposito  = 0.0;
		ContaBancaria cb = null;
		
		if(opcao == 's') {
			System.out.print("Informe o valor do Deposito Inicial: ");
			deposito = sc.nextDouble();
		    cb = new ContaBancaria(numeroConta, nomeTitular, deposito);
		}else {
			cb = new ContaBancaria(numeroConta, nomeTitular);
		}		
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Faça um deposito: ");
		deposito = sc.nextDouble();
		cb.depositar(deposito);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Faça um saque: ");
		double saque = sc.nextDouble();
		cb.sacar(saque);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(cb);
		
		sc.close();
	}

}
