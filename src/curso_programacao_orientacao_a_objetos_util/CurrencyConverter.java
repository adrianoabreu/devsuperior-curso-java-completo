package curso_programacao_orientacao_a_objetos_util;

public class CurrencyConverter {
	
	public static  double IOF = 0.06;
	
	public static double calculoConversao(double cotacaoDolar, double valorDolar) {
		 return cotacaoDolar * valorDolar * (1.0 + IOF);
	}
	
}
