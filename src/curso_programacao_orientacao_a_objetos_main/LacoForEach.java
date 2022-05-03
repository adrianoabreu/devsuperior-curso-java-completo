package curso_programacao_orientacao_a_objetos_main;

public class LacoForEach {
	/*
	 * Exemplo de utilização do for normal e do for each.
	 * 
	 * Leitura: "para cada objeto 'obj' contido em vect, faça:"
	 * 
	 */
	
	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//Laço for normal
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//Laço for each.
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
