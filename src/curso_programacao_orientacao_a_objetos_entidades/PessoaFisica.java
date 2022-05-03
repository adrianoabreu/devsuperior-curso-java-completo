package curso_programacao_orientacao_a_objetos_entidades;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calcularImposto() {
		Double imposto = 0.0;
		if(getRenda() < 20000.00) {
			imposto = getRenda() * 0.15;
		}else {
			imposto = getRenda() * 0.25;
		}
		
		if(gastoSaude > 0.0) {
			imposto = imposto - (gastoSaude / 2); // 50% do gastoSaude
		}
		return imposto;		
	}
	
	
	
}
