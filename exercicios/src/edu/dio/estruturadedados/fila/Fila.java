package edu.dio.estruturadedados.fila;

public class Fila<T> {
	private No<T> refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(T obj) {
		No<T> novoNo = new No<>(obj);
		novoNo.setRefNo(getRefNoEntradaFila());
		setRefNoEntradaFila(novoNo);
	}
	
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = this.refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					return primeiroNo.getObject();				
				}
			}
		}
		
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = this.refNoEntradaFila;
			No<T> noAuxiliar = this.refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					return primeiroNo.getObject();
				}
			}
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return getRefNoEntradaFila() == null;
	}
	
	public No<T> getRefNoEntradaFila() {
		return refNoEntradaFila;
	}
	
	public void setRefNoEntradaFila(No<T> refNoEntradaFila) {
		this.refNoEntradaFila = refNoEntradaFila;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No<T> noAuxiliar = this.refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		
		return stringRetorno;
	}
}
