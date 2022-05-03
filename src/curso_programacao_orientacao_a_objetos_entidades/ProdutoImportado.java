package curso_programacao_orientacao_a_objetos_entidades;

public class ProdutoImportado extends Produto8 {
	
	private Double taxaAlfandega;

	public ProdutoImportado() {
		
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome() + " $ " + String.format("%.2f", precoTotal()) + " (Taxa de Alfândega: $ " + String.format("%.2f", taxaAlfandega) + ")";
	}
	
	public Double precoTotal() {
		return taxaAlfandega + getPreco();
	}
	
}
