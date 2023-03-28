package edu.dio.estruturadedados.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.setPrimeiroNo(null);
		this.setUltimoNo(null);
		this.setTamanhoLista(0);
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(this.getUltimoNo());
		if(this.getPrimeiroNo() == null) {
			this.setPrimeiroNo(novoNo);
		}
		if(this.getUltimoNo() != null) {
			this.getUltimoNo().setNoProximo(novoNo);
		}
		this.setUltimoNo(novoNo);
		this.setTamanhoLista(this.getTamanhoLista() + 1);
	}
	
	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = this.getPrimeiroNo();
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
	
	public int size() {
		return this.getTamanhoLista();
	}
	
	public NoDuplo<T> getPrimeiroNo() {
		return primeiroNo;
	}
	
	public void setPrimeiroNo(NoDuplo<T> primeiroNo) {
		this.primeiroNo = primeiroNo;
	}
	public NoDuplo<T> getUltimoNo() {
		return ultimoNo;
	}
	public void setUltimoNo(NoDuplo<T> ultimoNo) {
		this.ultimoNo = ultimoNo;
	}
	public int getTamanhoLista() {
		return tamanhoLista;
	}
	public void setTamanhoLista(int tamanhoLista) {
		this.tamanhoLista = tamanhoLista;
	}
}
