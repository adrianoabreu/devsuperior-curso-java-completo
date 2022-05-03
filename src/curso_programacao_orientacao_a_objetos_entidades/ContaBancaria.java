package curso_programacao_orientacao_a_objetos_entidades;

public class ContaBancaria {

	private int    numeroConta;
	private String nomeTitular;
	private double saldo;
		
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {		
		this.numeroConta   = numeroConta;
		this.nomeTitular   = nomeTitular;
		depositar(depositoInicial);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void sacar(double valorASacar) {
		saldo -= valorASacar + 5.00;
	}
	
	public String toString() {
		return "Conta: " + getNumeroConta() + ", Titular: " + getNomeTitular() + ", Saldo: $ " + String.format("%.2f", saldo);
	}
	
}
