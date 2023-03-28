package edu.dio.estruturadedados.listaduplamenteencadeada;

public class NoDuplo<T> {
	private T conteudo;
	private NoDuplo<T> noProximo;
	private NoDuplo<T> noPrevio;
	
	public NoDuplo(T conteudo) {
		this.setConteudo(conteudo);
	}
	
	public T getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
}
