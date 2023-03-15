package edu.dio.estruturadedados.pilha;

public class Pilha<T> {
	public No<T> refNoTopoPilha;
	
	public Pilha() {
		this.refNoTopoPilha = null;
	}
	
	public void push(No<T> novoNo) {
		No<T> refAuxiliar = this.refNoTopoPilha;
		this.refNoTopoPilha = novoNo;
		novoNo.setRefNo(refAuxiliar);
	}
	
	public No<T> pop() {
		if(!this.isEmpty()) {
			No<T> noPopped = this.top();
			this.refNoTopoPilha = this.top().getRefNo();
			return noPopped;
		}
		
		return null;
	}
	
	public No<T> top() {
		return this.refNoTopoPilha;
	}
	
	public boolean isEmpty() {
		return this.refNoTopoPilha == null ? true : false;
	}
	
	@Override
	public String toString() {
		String stringRetorno;
		
		stringRetorno = "----------\n";
		stringRetorno += "Pilha\n";
		stringRetorno += "----------\n";
		
		No<T> noAuxiliar = this.refNoTopoPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			} else {
				break;
			}
		}
		
		stringRetorno += "==========\n";
		return stringRetorno;
	}
}
