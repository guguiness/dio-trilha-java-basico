package edu.dio.estruturadedados.queue;

import java.util.LinkedList;
import java.util.Queue;

import edu.dio.estruturadedados.equalshashcode.Carro;

public class Main {

	public static void main(String[] args) {
		Queue<Carro> queueCarros = new LinkedList<>();

		queueCarros.add(new Carro("Carro1"));
		queueCarros.add(new Carro("Carro2"));
		queueCarros.add(new Carro("Carro3"));
		
		System.out.println(queueCarros.add(new Carro("Carro4")));		// dá erro se falhar
		System.out.println(queueCarros);
	
		System.out.println(queueCarros.offer(new Carro("Carr5")));		// apenas retorna false se falhar
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());	
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());	
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros.size());
	}

}
