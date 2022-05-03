package curso_programacao_orientacao_a_objetos_main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TratamentoDeExcecaoBlocoFinally {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\adria\\OneDrive\\Documentos\\CURSOS UDEMY\\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\\15 Tratamento de exceções\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo); // A classe Scanner, além de receber dados do console, também lê arquivos texto.
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Erro na abertura do arquivo: " + e.getMessage());
		}finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco Finally executado!");
		}
		
	}

}
