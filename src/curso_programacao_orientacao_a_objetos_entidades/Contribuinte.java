package curso_programacao_orientacao_a_objetos_entidades;

public abstract class Contribuinte {
	
	private String nome;
	private Double renda;
	
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public abstract Double calcularImposto();
	
}
