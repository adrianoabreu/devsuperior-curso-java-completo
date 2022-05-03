package curso_programacao_orientacao_a_objetos_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Funcionario2;

public class ExercicioFixacao7Listas {
	/*
	 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
	 * N funcionários. Não deve haver repetição de id.
	 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
	 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
	 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
	 * conforme exemplos.
	 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
	 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
	 * aumento por porcentagem dada.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario2> listaFunc = new ArrayList<>();
		
		Funcionario2 func = null;
		
		Integer id = 0;
		String nome  = null;
		Double salario  = 0.0;		

		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Funcionario " + (i + 1) + ":");
			System.out.print("Entre com o ID do funcionario: ");
			id = sc.nextInt();
			while(procuraId(listaFunc,id)) {
				System.out.println("Id já existe! Tente novamente:");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Entre com o nome do funcionario: ");
			nome = sc.nextLine();
			System.out.print("Entre com o salario do funcionario: ");
			salario = sc.nextDouble();
			
			func = new Funcionario2(id,nome,salario);
			
			listaFunc.add(func);
		}
		
		System.out.println();
		System.out.print("Entre com o Id do funcionario:");
		int idSalario = sc.nextInt();
		
		Funcionario2 funcionario = listaFunc.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		//Integer posicao = procurarPosicaoId(listaFunc,idSalario);
		//if(posicao == null) {
		
		if(funcionario == null) {
			System.out.println("Esse Id não existe!");
		}else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionario.aumentarSalario(porcentagem);
			//listaFunc.get(posicao).aumentarSalario(porcentagem);//listaFunc.get(i) acessa a posição de um elemento da lista.
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for(Funcionario2 f : listaFunc) {
			System.out.println(f);
		}
		
		sc.close();
		
	}
	
	//metodo que retorna a posição do id caso o mesmo seja encontrado na lista. Se o metodo retorna null é por que não encontrou o id.
	static Integer procurarPosicaoId(List<Funcionario2> lista, int id){
		for(int i = 0; i<lista.size();i++) {
			if(lista.get(i).getId() == id)    //lista.get(i) acessa a posição de um elemento da lista.
			return i;  
		}
		return null;
	}
	
	static boolean procuraId(List<Funcionario2> lista, int id) {
		Funcionario2 func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
