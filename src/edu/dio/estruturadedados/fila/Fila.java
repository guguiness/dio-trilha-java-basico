package edu.dio.estruturadedados.fila;

public class Fila {
	private No refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(Object obj) {
		No novoNo = new No(obj);
		novoNo.setRefNo(getRefNoEntradaFila());
		setRefNoEntradaFila(novoNo);
	}
	
	public Object first() {
		if(!this.isEmpty()) {
			No primeiroNo = this.refNoEntradaFila;
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
	
	public Object dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = this.refNoEntradaFila;
			No noAuxiliar = this.refNoEntradaFila;
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
	
	public No getRefNoEntradaFila() {
		return refNoEntradaFila;
	}
	
	public void setRefNoEntradaFila(No refNoEntradaFila) {
		this.refNoEntradaFila = refNoEntradaFila;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = this.refNoEntradaFila;
		
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
