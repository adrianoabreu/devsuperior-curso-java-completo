package curso_programacao_orientacao_a_objetos_entidades;

public class ItemDoPedido {

	private Integer quantidade;
	private Double  preco;
	
	private Produto7 produto;
	
	public ItemDoPedido() {

	}
	
	public ItemDoPedido(Integer quantidade, Double preco, Produto7 produto) {
		this.quantidade = quantidade;
		this.preco      = preco;
		this.produto    = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto7 getProduto7() {
		return produto;
	}

	public void setProduto7(Produto7 produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		return getProduto7().getNome() + ", $" + String.format("%.2f", preco) + ", Quantidade: " + quantidade + ", Subtotal: " + String.format("%.2f", subTotal());
	}
}
