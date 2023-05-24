package edu.dio.estruturadedados.pilha;

public class Main {
	public static void main(String[] args) {
		Pilha<Integer> minhaPilha = new Pilha<>();
		
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));
		
		System.out.println(minhaPilha);
		System.out.println("Valor retirado: " + minhaPilha.pop());
		System.out.println(minhaPilha);
		minhaPilha.push(new No(99));
		System.out.println(minhaPilha);
		
	}
}
