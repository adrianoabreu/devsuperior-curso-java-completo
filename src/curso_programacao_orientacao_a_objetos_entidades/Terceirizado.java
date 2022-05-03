package curso_programacao_orientacao_a_objetos_entidades;

public class Terceirizado extends Funcionario3{

	private Double despesaAdicional;
	
	public Terceirizado() {
		super();
	}
	
	public Terceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	
	
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + this.despesaAdicional * 1.1;	
	}
	
}
