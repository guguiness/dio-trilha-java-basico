package edu.dio.estruturadedados.listaencadeada;

public class ListaEncadeada<T> {
	private No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.setReferenciaEntrada(null);
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpty()) {
			this.setReferenciaEntrada(novoNo);
			return;
		}
		
		No<T> noAuxiliar = this.getReferenciaEntrada();
		for(int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	public T remove(int index) {
		No<T> noPivo = this.getNo(index);
		
		if(index == 0) {
			this.setReferenciaEntrada(noPivo.getProximoNo());
			return noPivo.getConteudo();
		}
		
		No<T> noAnterior = this.getNo(index - 1);
		noAnterior.setProximoNo(noPivo.getProximoNo());
		return noPivo.getConteudo();
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index) {
		this.validaIndice(index);
		
		No<T> noAuxiliar = this.getReferenciaEntrada();
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		return noRetorno;
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> noAuxiliar = this.getReferenciaEntrada();
		
		if(noAuxiliar != null) {
			while(true) {
				tamanhoLista++;
				if(noAuxiliar.getProximoNo() != null) {
					noAuxiliar = noAuxiliar.getProximoNo();
				} else {
					break;
				}
			}
		}
		
		return tamanhoLista;
	}
	
	private void validaIndice(int index) {
		if(index >= this.size()) {
			int ultimoIndice = this.size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + 
					index + " desta lista. Maior índice disponível: " + ultimoIndice);
		}
	}
	
	public boolean isEmpty() {
		return this.getReferenciaEntrada() == null;
	}

	private No<T> getReferenciaEntrada() {
		return referenciaEntrada;
	}

	private void setReferenciaEntrada(No<T> referenciaEntrada) {
		this.referenciaEntrada = referenciaEntrada;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		No<T> noAuxiliar = this.getReferenciaEntrada();
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}]-->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		strRetorno += "null";
		
		return strRetorno;
	}
}
