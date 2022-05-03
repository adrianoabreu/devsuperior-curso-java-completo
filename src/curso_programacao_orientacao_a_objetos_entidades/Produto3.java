package curso_programacao_orientacao_a_objetos_entidades;

public class Produto3 {
	
	public String nome;
	public double preco;
	public int    quantidade;
	
	//Contrutor Padrão
	public Produto3(){
		
	}
	
	public Produto3(String nome, double preco, int quantidade){
		this.nome       = nome;
		this.preco      = preco;
		this.quantidade = quantidade;
	}
	
	//Quando há mais de um construtor na classe, significa que a classe possui Sobrecarga.
	public Produto3(String nome, double preco){
		this.nome       = nome;
		this.preco      = preco;
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
