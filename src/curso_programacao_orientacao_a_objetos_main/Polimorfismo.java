package curso_programacao_orientacao_a_objetos_main;

import curso_programacao_orientacao_a_objetos_entidades.Conta;
import curso_programacao_orientacao_a_objetos_entidades.ContaNegocio;

public class Polimorfismo {
	/*
	 * Em Programação Orientada a Objetos, polimorfismo é recurso que
	 * permite que variáveis de um mesmo tipo mais genérico possam
	 * apontar para objetos de tipos específicos diferentes, tendo assim
	 * comportamentos diferentes conforme cada tipo específico.
	 */
	public static void main(String[] args) {
		
		Conta x = new Conta(1020, "Adriano", 1000.0);
		Conta y = new ContaNegocio(1023, "Adriano", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println("Saldo do X: " + x.getSaldo());
		System.out.println("Saldo do Y: " + y.getSaldo());
	}

}
