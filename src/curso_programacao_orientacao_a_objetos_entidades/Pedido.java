package curso_programacao_orientacao_a_objetos_entidades;

import java.util.Date;

public class Pedido {
	
	private Date data;
	private Produto5 produto5;
	
	public Pedido(Date data, Produto5 produto5) {
		super();
		this.data = data;
		this.produto5 = produto5;
		this.produto5.nome = "TV";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto5 getProduto5() {
		return produto5;
	}

	public void setProduto5(Produto5 produto5) {
		this.produto5 = produto5;
	}
	
	
	
}
