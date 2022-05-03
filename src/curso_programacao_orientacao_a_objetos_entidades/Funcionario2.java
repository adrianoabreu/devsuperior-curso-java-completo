package curso_programacao_orientacao_a_objetos_entidades;

public class Funcionario2 {

	private Integer id;
	private String nome;
	private Double salario;
		
	public Funcionario2() {
	
	}
	
	public Funcionario2(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(Double porcentagem) {
		this.salario = this.salario + (this.salario * porcentagem / 100); //a palavra this nesse caso é opcional, mas optei por deixar para identificar o atributo da classe.
	}
	
	@Override //Essa anotação ajuda a não errar. Ou seja, caso seja digitado errado o metodo toString() da classe Object, ele indica que está errado.
	public String toString() {
		return this.id + ", " + this.nome + ", " + String.format("%.2f", this.salario);
	}
}
