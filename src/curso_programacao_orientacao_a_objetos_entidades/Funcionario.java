package curso_programacao_orientacao_a_objetos_entidades;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double netSalario() {
		return salario - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSalario());
	}
	
}
