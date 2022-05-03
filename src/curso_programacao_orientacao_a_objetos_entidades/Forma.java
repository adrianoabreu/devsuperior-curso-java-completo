package curso_programacao_orientacao_a_objetos_entidades;

import curso_programacao_orientacao_a_objetos_entidades_enums.Cor;

public abstract class Forma {
	
	private Cor cor;

	public Forma() {
		
	}
		
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
