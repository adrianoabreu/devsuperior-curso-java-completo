package curso_programacao_orientacao_a_objetos_main;

import curso_programacao_orientacao_a_objetos_entidades.Conta;
import curso_programacao_orientacao_a_objetos_entidades.ContaNegocio;

public class Heranca {
	/*
	 * Suponha um negócio de banco que possui uma conta comum e uma conta para
	 * empresas, sendo que a conta para empresa possui todos membros da conta
	 * comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
	 */
	public static void main(String[] args) {
		
		ContaNegocio cn = new ContaNegocio(010101, "Adriano Abreu", 200.00, 800.00);
		cn.depositar(900.00);
		System.out.println(cn.getSaldo());
		
		cn.saque(300.00);
		System.out.println(cn.getSaldo());
		
		// UPCASTING - converter objeto da subclasse para a superclasse
		Conta conta  = cn;
		Conta conta2 = new ContaNegocio(010101, "Adriano Abreu", 200.00, 800.00);
		
		// DOWNCASTING - converter objeto da superclasse para a subclasse
		ContaNegocio cn2 = (ContaNegocio)conta;
		cn2.emprestimo(100.0);
		
		
		// TESTANDO SOBREPOSIÇÃO OU SOBRESCRITA DE METODOS
		Conta conta3 = new Conta(010101, "Adriano Abreu", 1000.00);
		System.out.println(conta3.getSaldo());
		conta3.saque(200.00);
		System.out.println(conta3.getSaldo());
		
		Conta conta4 = new ContaNegocio(010101, "Adriano Abreu", 1000.00, 0.01);
		System.out.println(conta4.getSaldo());
		conta4.saque(200.00);
		System.out.println(conta4.getSaldo());
		
		
		// TESTANDO A PALAVRA super
		Conta conta5 = new ContaNegocio(010101, "Adriano Abreu", 1000.00, 500.00);
		conta5.saque(200.00);
		System.out.println(conta5.getSaldo());
	}

}
