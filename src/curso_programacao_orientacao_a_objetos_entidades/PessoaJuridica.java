package curso_programacao_orientacao_a_objetos_entidades;

public class PessoaJuridica extends Contribuinte{
	
	private Integer quantidadeFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double renda, Integer quantidadeFunc) {
		super(nome, renda);
		this.quantidadeFunc = quantidadeFunc;
	}

	public Integer getQuantidadeFunc() {
		return quantidadeFunc;
	}

	public void setQuantidadeFunc(Integer quantidadeFunc) {
		this.quantidadeFunc = quantidadeFunc;
	}

	@Override
	public Double calcularImposto() {
		Double imposto = 0.0;
		if(quantidadeFunc > 10) {
			imposto = getRenda() * 0.14;
		}else {
			imposto = getRenda() * 0.16;
		}
		return imposto;	
		
	}
	
	
	
}
