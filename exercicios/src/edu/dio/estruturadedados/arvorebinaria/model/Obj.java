package edu.dio.estruturadedados.arvorebinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
	Integer meuValor;
	
	public Obj(Integer meuValor) {
		this.meuValor = meuValor;
	}

	@Override
	public int compareTo(Obj outro) {
		int i = 0;
		
		if(this.getMeuValor() > outro.getMeuValor()) {
			i = 1;
		} else if(this.getMeuValor() < outro.getMeuValor()) {
			i = -1;
		}
		
		return i;
	}

	@Override
	public int hashCode() {
		return Objects.hash(meuValor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return Objects.equals(meuValor, other.meuValor);
	}

	public Integer getMeuValor() {
		return meuValor;
	}

	public void setMeuValor(Integer meuValor) {
		this.meuValor = meuValor;
	}
	
	@Override
	public String toString() {
		return meuValor.toString();
	}
}
