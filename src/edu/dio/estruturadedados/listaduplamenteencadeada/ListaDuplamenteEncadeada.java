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
	
	public void add(int index, T elemento) {
		NoDuplo<T> noAuxiliar = this.getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		
		novoNo.setNoProximo(noAuxiliar);
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		} else {
			novoNo.setNoPrevio(this.getUltimoNo());
			this.setUltimoNo(novoNo);
		}
		
		if(index == 0) {
			this.setPrimeiroNo(novoNo);
		} else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		this.setTamanhoLista(this.getTamanhoLista() + 1);
	}
	
	private T remove(int index) {
		if(this.getTamanhoLista() != 0) {
			NoDuplo<T> noAuxiliar = this.getNo(index);
			T elementoRemovido = noAuxiliar.getConteudo();
			
			if(index == 0) {
				this.setPrimeiroNo(this.getPrimeiroNo().getNoProximo());
				this.getPrimeiroNo().setNoPrevio(null);
				this.setTamanhoLista(this.getTamanhoLista() - 1);
				return elementoRemovido;
			}
			
			if(noAuxiliar != this.getUltimoNo()) {
				noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
				this.setTamanhoLista(this.getTamanhoLista() - 1);
				return elementoRemovido;
			}
			
			noAuxiliar.getNoPrevio().setNoProximo(null);
			this.setUltimoNo(noAuxiliar.getNoPrevio());
			this.setTamanhoLista(this.getTamanhoLista() - 1);
			return elementoRemovido;
		}
		
		return null;
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

	@Override
	public String toString() {
		String strRetorno = "";
		
		NoDuplo<T> noAuxiliar = this.getPrimeiroNo();
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		strRetorno += "null";
		return strRetorno;
	}
}
