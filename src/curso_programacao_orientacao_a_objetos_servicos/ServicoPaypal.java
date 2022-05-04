package curso_programacao_orientacao_a_objetos_servicos;

public class ServicoPaypal implements ServicoDePagamentoOnline{

	// O Hardcode definido abaixo é uma prática incorreta, mas foi definido para fins didáticos. 
	// O correto é buscar a taxa e os juros de um banco de dados ou arquivo texto.
	private static final Double TAXA_DE_PAGAMENTO = 0.02; // 2%
	private static final Double JUROS_MENSAL      = 0.01; // 1%
	
	@Override
	public Double taxaDePagamento(Double valor) {
		return valor * TAXA_DE_PAGAMENTO;
	}

	@Override
	public Double jurosMensal(Double valor, Integer mes) {
		return valor * mes * JUROS_MENSAL;
	}

}
