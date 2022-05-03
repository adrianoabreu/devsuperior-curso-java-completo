package curso_programacao_orientacao_a_objetos_entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto8 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	public ProdutoUsado() {
		
	}
	
	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String etiquetaDePreco() {
		return getNome() + "(used) $ " + String.format("%.2f", getPreco()) + " (Data de Fabricação: " + sdf.format(dataFabricacao) + ")";
	}
	
}
