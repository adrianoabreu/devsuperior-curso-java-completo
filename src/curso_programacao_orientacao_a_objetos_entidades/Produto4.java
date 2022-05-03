package curso_programacao_orientacao_a_objetos_entidades;

public class Produto4 {
	
	//O modificador de acesso private faz parte do Encapsulamento, juntamente com os metodos get e set dos atributos nome, preco e quantidade.
	private String nome;
	private double preco;
	private int    quantidade;
	
	//Contrutor Padrão
	public Produto4(){
		
	}
	
	public Produto4(String nome, double preco, int quantidade){
		this.nome       = nome;
		this.preco      = preco;
		this.quantidade = quantidade;
	}
	
	//Quando há mais de um contrutor na classe, significa que a classe possui Sobrecarga.
	public Produto4(String nome, double preco){
		this.nome       = nome;
		this.preco      = preco;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f",valorTotalEmEstoque());
	}
}
