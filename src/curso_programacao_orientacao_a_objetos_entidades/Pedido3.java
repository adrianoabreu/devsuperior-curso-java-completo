package curso_programacao_orientacao_a_objetos_entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import curso_programacao_orientacao_a_objetos_entidades_enums.StatusDoPedido;

public class Pedido3 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date data;
	private StatusDoPedido status;
	
	private List<ItemDoPedido> itens = new ArrayList<>();
	private Cliente cliente;
	
	public Pedido3() {

	}
	
	public Pedido3(Date data, StatusDoPedido status, Cliente cliente) {
		this.data = data;
		this.status = status;
		this.cliente = cliente;
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
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaItem(ItemDoPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemDoPedido item) {
		itens.remove(item);
	}
	
	public double Total() {
		double soma = 0;
		for (ItemDoPedido i : itens) {
			 soma += i.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data do Pedido: ");
		sb.append(sdf.format(data) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido:\n");
		for (ItemDoPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", Total()));
		return sb.toString();
	}
}
