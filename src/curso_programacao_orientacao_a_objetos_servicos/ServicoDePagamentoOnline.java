package curso_programacao_orientacao_a_objetos_servicos;

public interface ServicoDePagamentoOnline {

	Double taxaDePagamento(Double valor);
	Double jurosMensal(Double valor, Integer mes);
	
}
