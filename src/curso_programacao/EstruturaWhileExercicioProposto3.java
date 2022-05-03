package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioProposto3 {
	/*
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
	 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
	 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
	 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
	 * exemplo.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int quantidadeAlcool   = 0;
		int quantidadeGasolina = 0;
		int quantidadeDiesel   = 0;
		
		while(combustivel != 4) {
			if(combustivel == 1) {
				quantidadeAlcool     += 1;
			}else if(combustivel == 2){
				quantidadeGasolina   += 1;
			}else if(combustivel == 3) {
				quantidadeDiesel     += 1;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool:   " + quantidadeAlcool);
		System.out.println("Gasolina: " + quantidadeGasolina);
		System.out.println("Diesel:   " + quantidadeDiesel);
		
		sc.close();		
		

	}

}
