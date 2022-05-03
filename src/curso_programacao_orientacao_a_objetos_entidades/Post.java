package curso_programacao_orientacao_a_objetos_entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date    data;
	private String  titulo;
	private String  conteudo;
	private Integer likes;
	
	/*
	 * Abaixo estão declaradas as associações de composição de objetos entre as classes.
	 * 1 Post possui vários comentários. É necessário a declaração da lista abaixo.
	 * ATENÇÃO!: Quando uma classe(Post) possui uma composição que é uma lista(Comentario), é obrigatório instanciar a lista com ArrayList e não incluir a lista no contrutor usando campos.
	 */
	private List<Comentario> comentarios = new ArrayList<>();

	public Post() {
		
	}
		
	public Post(Date data, String titulo, String conteudo, Integer likes) {
		this.data        = data;
		this.titulo      = titulo;
		this.conteudo    = conteudo;
		this.likes       = likes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}		
		
	// Utilização da classe StringBuilder
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(data) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários: " + "\n");
		for(Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}
