package curso_programacao_orientacao_a_objetos_entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import curso_programacao_orientacao_a_objetos_entidades_enums.NivelDoTrabalhador;

public class Trabalhador {
	
	
	private String nome;
	private NivelDoTrabalhador nivel;
	private Double salarioBase;
	
	/*
	 * Abaixo estão declaradas as associações de composição de objetos entre as classes.
	 * 1 trabalhador faz parte de 1 departamento. É necessário a declaração abaixo.
	 * 1 trabalhador possui vários contrátos. É necessário a declaração da lista abaixo.
	 * ATENÇÃO!: Quando uma classe(Trabalhador) possui uma composição que é uma lista(Contratos), é obrigatório instanciar a lista com ArrayList e não incluir a lista no contrutor usando campos.
	 */
	private Departamento departamento;
	private List<HorasDeContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome         = nome;
		this.nivel        = nivel;
		this.salarioBase  = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasDeContrato> getContratos() {
		return contratos;
	}
	
	public void adicionarContratos(HorasDeContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContratos(HorasDeContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double rendaTotal(int mes, int ano) {
		double soma = salarioBase;             // atribui salario base do trabalhador a um funcionário;
		Calendar cal = Calendar.getInstance(); // cria uma instancia da classe Calendar;
		for(HorasDeContrato c : contratos) {   // Declara um for each para percorrer os contratos do trabalhador.
			cal.setTime(c.getData());          // seta a variavel cal com a data do contrato lido.
			int c_ano = cal.get(Calendar.YEAR); // atribui o ano obtido da variavel cal a variável c_ano;
			int c_mes = 1 + cal.get(Calendar.MONTH); // atribui o mes obtido da variavel cal a variável c_mes;
			if(ano == c_ano && mes == c_mes) { // Condicional para verificar se o ano e mes informados como entrada de dados são iguais aos dos contratos. 
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
}
