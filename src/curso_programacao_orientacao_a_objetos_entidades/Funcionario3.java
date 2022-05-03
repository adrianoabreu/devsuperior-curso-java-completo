package curso_programacao_orientacao_a_objetos_entidades;

public class Funcionario3 {
	
	private String  nome;
	private Integer horas;
	private Double  valorPorHora;
	
	public Funcionario3() {
	}
	
	public Funcionario3(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento() {
		return valorPorHora * horas;
	}
	
	
	
}
