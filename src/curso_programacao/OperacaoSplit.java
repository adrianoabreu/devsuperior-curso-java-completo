package curso_programacao;

public class OperacaoSplit {
	/*
	 * A operação split() recorta partes de uma String.
	 */
	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
		System.out.println("word3: " + word3);
		
	}

}
