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
	
	public void remover(T conteudo) {
		try {
			BinNo<T> atual = this.getRaiz();
			BinNo<T> pai = null;
			BinNo<T> filho= null;
			BinNo<T> temp = null;
			
			if(atual != null && !atual.getConteudo().equals(conteudo)) {
				pai = atual;
				if(conteudo.compareTo(atual.getConteudo()) < 0) {
					atual = atual.getNoEsq();
				} else {
					atual = atual.getNoDir();
				}
			}
			
			if(atual == null) {
				System.out.println("Conteúdo não encontrado. Bloco Try");
			}
			
			if(pai == null) {
				if(atual.getNoDir() == null) {
					this.setRaiz(atual.getNoEsq());
				} else if(atual.getNoEsq() == null) {
					this.setRaiz(atual.getNoDir());
				} else {
					for(temp = atual, filho = atual.getNoEsq();
							filho.getNoDir() != null;
							temp = filho, filho = filho.getNoEsq()) {
						if(filho != atual.getNoEsq()) {
							temp.setNoDir(filho.getNoEsq());
							filho.setNoEsq(this.getRaiz().getNoEsq());
						}
					}
					
					filho.setNoDir(this.getRaiz().getNoDir());
					this.setRaiz(filho);
				}
			} else if(filho.getNoDir() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoEsq());
				} else {
					pai.setNoDir(atual.getNoEsq());
				}
			} else if(filho.getNoEsq() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoDir());
				} else {
					pai.setNoDir(atual.getNoDir());
				}
			} else {
				for(temp = atual, filho = atual.getNoEsq();
						filho.getNoDir() != null;
						temp = filho, filho = filho.getNoDir()) {
					if(filho != atual.getNoEsq()) {
						temp.setNoDir(filho.getNoEsq());
						filho.setNoEsq(atual.getNoEsq());
					}
					
					filho.setNoDir(atual.getNoDir());
					if(pai.getNoEsq() == atual) {
						pai.setNoEsq(filho);
					} else {
						pai.setNoDir(filho);
					}
				}
			}
			
		} catch (NullPointerException e) {
			System.out.println("Conteúdo não encontrado. Bloco Catch");
		}
	}
	
	public void exibirInOrdem() {
		System.out.println("\nExibindo InOrdem");
		exibirInOrdem(this.getRaiz());
	}
	
	private void exibirInOrdem(BinNo<T> atual) {
		if(atual != null) {
			this.exibirInOrdem(atual.getNoEsq());
			System.out.print(atual.getConteudo() + " | ");
			this.exibirInOrdem(atual.getNoDir());
		}
	}

	public void exibirPosOrdem() {
		System.out.println("\nExibindo PosOrdem");
		exibirPosOrdem(this.getRaiz());
	}
	
	private void exibirPosOrdem(BinNo<T> atual) {
		if(atual != null) {
			this.exibirPosOrdem(atual.getNoEsq());
			this.exibirPosOrdem(atual.getNoDir());
			System.out.print(atual.getConteudo() + " | ");
		}
	}

	public void exibirPreOrdem() {
		System.out.println("\nExibindo PreOrdem");
		exibirPreOrdem(this.getRaiz());
	}
	
	private void exibirPreOrdem(BinNo<T> atual) {
		if(atual != null) {
			System.out.print(atual.getConteudo() + " | ");
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
