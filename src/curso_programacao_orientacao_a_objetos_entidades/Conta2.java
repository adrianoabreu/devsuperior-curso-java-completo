package curso_programacao_orientacao_a_objetos_entidades;

import curso_programacao_orientacao_a_objetos_excecoes.DominioDeExcecoes;

public class Conta2 {

	private Integer numero;
	private String  titular;
	private Double  saldo;
	private Double  limiteDeSaque;
	
	public Conta2() {
		
	}
	
	public Conta2(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
		this.numero        = numero;
		this.titular       = titular;
		this.saldo         = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void sacar(Double valor) {
		validarSaque(valor);
		saldo -= valor;
	}
	
	private void validarSaque(Double valor) {
		if(valor > limiteDeSaque) {
			throw new DominioDeExcecoes("Valor do saque maior que valor do limite do saque.");
		}
		if(saldo < valor) {
			throw new DominioDeExcecoes("Saldo insuficiente para o saque.");
		}
	}
}
