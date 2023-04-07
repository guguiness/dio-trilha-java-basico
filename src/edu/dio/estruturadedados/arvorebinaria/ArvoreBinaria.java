package edu.dio.estruturadedados.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
	private BinNo<T> raiz;
	
	public ArvoreBinaria() {
		this.setRaiz(null);
	}
	
	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		raiz = inserir(raiz, novoNo);
	}
	
	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
		if(atual == null) {
			return novoNo;
		} else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		} else {
			atual.setNoDir(inserir(atual.getNoDir(), novoNo));
		}
		
		return atual;
	}
	
	public void exibirInOrdem() {
		System.out.println("\nExibindo InOrdem");
		exibirInOrdem(this.getRaiz());
	}
	
	private void exibirInOrdem(BinNo<T> atual) {
		if(atual != null) {
			this.exibirInOrdem(atual.getNoEsq());
			System.out.println(atual.getConteudo() + " | ");
			this.exibirInOrdem(atual.getNoDir());
		}
	}

	public void exibirPosOrdem() {
		System.out.println("\nExibindo InOrdem");
		exibirInOrdem(this.getRaiz());
	}
	
	private void exibirPosOrdem(BinNo<T> atual) {
		if(atual != null) {
			this.exibirPosOrdem(atual.getNoEsq());
			this.exibirPosOrdem(atual.getNoDir());
			System.out.println(atual.getConteudo() + " | ");
		}
	}

	public void exibirPreOrdem() {
		System.out.println("\nExibindo InOrdem");
		exibirInOrdem(this.getRaiz());
	}
	
	private void exibirPreOrdem(BinNo<T> atual) {
		if(atual != null) {
			System.out.println(atual.getConteudo() + " | ");
			this.exibirPreOrdem(atual.getNoEsq());
			this.exibirPreOrdem(atual.getNoDir());
		}
	}
	

	public BinNo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(BinNo<T> raiz) {
		this.raiz = raiz;
	}
}
