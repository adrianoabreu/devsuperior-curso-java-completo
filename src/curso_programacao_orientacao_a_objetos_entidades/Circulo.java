package curso_programacao_orientacao_a_objetos_entidades;

import curso_programacao_orientacao_a_objetos_entidades_enums.Cor;

public class Circulo extends Forma{
	
	private Double raio;
	
	public Circulo() {
		
	}
		
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return (raio * raio) * Math.PI;
	}

}
