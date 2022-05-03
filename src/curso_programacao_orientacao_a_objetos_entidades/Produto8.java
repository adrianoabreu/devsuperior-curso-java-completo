package curso_programacao_orientacao_a_objetos_entidades;

public class Produto8 {
	
	private String nome;
	private Double preco;
	
	public Produto8() {

	}
	
	public Produto8(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaDePreco() {
		return nome + " $ " + String.format("%.2f", preco);
	}
	
}
