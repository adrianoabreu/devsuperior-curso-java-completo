package curso_programacao;

public class EscopoEInicializacao {
	/*
	 * Variáveis no Java sempre precisam ser inicializadas de alguma maneira.
	 * O escopo de uma variável é quando se declara uma variável que pode ser usada dentro de uma  condição if-else ou fora dela. 
	 */
	public static void main(String[] args) {
		
		double price = 400.00;
		
		double discount; // Variável pode ser inicializada como: double discount = 0; Porém não é necessário o else abaixo.
		
		if(price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
