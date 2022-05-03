package curso_programacao_orientacao_a_objetos_entidades;

import curso_programacao_orientacao_a_objetos_entidades_enums.Cor;

public class Retangulo2 extends Forma {

	private Double largura;
	private Double altura;
	
	public Retangulo2() {
		
	}
	
	public Retangulo2(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

}
