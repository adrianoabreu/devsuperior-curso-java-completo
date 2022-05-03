package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Conta2;
import curso_programacao_orientacao_a_objetos_excecoes.DominioDeExcecoes;

public class ExercicioFixacao12Excecoes {
	/*
	 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um
	 * saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
	 * ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
	 * saque da conta.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta:");
		System.out.print("Digite o numero da conta: ");
		Integer conta = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Digite o valor do saldo inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Digite o valor de limite do saque: ");
		Double limite = sc.nextDouble();
		Conta2 conta2 = new Conta2(conta, nome, saldo, limite);
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		Double saque = sc.nextDouble();
		try {
			conta2.sacar(saque);
			System.out.print("Novo Saldo: " + conta2.getSaldo());
		} catch (DominioDeExcecoes e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
	}

}
