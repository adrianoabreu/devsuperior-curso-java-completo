package curso_programacao_orientacao_a_objetos_entidades;

public class ContaNegocio extends Conta{

	private Double limiteDeEmprestimo;

	public ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limiteDeEmprestimo) {
			saldo += valor - 10.0;
		}
		
	}
	
	@Override  // é uma boa pratica para indicar sobreposição de metodos da superclasse.
	public void saque(double valor) {
		super.saque(valor);  // a palavra super permite reutilizar o metodo saque() da superclasse
		//saldo -= valor;
		saldo -= 2.0;
	}
	
}
