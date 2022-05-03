package curso_programacao_orientacao_a_objetos_entidades;

public class Produto5 {
	
	//Modificador de acesso private   - atributos são acessados diretamente somente dentro da própria classe.
	//Modificador de acesso public    - atributos são acessados diretamente por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)
	//Modificador de acesso protected - atributos são acessados diretamente no mesmo pacote, bem como em subclasses de pacotes diferentes.
	//Modificador de acesso (nada)    - atributos são acessados diretamente nas classes do mesmo pacote.
	String nome;
	private double preco;
	private int    quantidade;
	
	//Contrutor Padrão
	public Produto5(){
		
	}
	
	public Produto5(String nome, double preco, int quantidade){
		this.nome       = nome;
		this.preco      = preco;
		this.quantidade = quantidade;
	}
	
	//Quando há mais de um contrutor na classe, significa que a classe possui Sobrecarga.
	public Produto5(String nome, double preco){
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
