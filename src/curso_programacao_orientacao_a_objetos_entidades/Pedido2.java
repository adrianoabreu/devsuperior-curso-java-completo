package curso_programacao_orientacao_a_objetos_entidades;

import java.util.Date;

import curso_programacao_orientacao_a_objetos_entidades_enums.StatusDoPedido;

public class Pedido2 {

	private Integer id;
	private Date data;
	private StatusDoPedido status;
	
	public Pedido2() {

	}
	
	public Pedido2(Integer id, Date data, StatusDoPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido2 [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	
}
