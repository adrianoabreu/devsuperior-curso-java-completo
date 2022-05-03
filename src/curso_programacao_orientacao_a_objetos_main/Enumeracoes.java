package curso_programacao_orientacao_a_objetos_main;

import java.util.Date;

import curso_programacao_orientacao_a_objetos_entidades.Pedido2;
import curso_programacao_orientacao_a_objetos_entidades_enums.StatusDoPedido;

public class Enumeracoes {

	public static void main(String[] args) {
		
		Pedido2 pedido = new Pedido2(1080, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		
		//Conversão de String para Enum.
		StatusDoPedido status1 = StatusDoPedido.ENTREGUE;
		StatusDoPedido status2 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(status1);
		System.out.println(status2);
		
		
		
		
	}

}
