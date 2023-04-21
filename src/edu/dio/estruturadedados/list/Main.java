package edu.dio.estruturadedados.list;

import java.util.ArrayList;
import java.util.List;

import edu.dio.estruturadedados.equalshashcode.Carro;

public class Main {

	public static void main(String[] args) {
		List<Carro> listCarros = new ArrayList<>();

		listCarros.add(new Carro("Carro1"));
		listCarros.add(new Carro("Carro2"));
		listCarros.add(new Carro("Carro3"));
		listCarros.add(new Carro("Carro4"));	
		
		System.out.println(listCarros.contains(new Carro("Carro3")));
		
		System.out.println(listCarros.get(2));

		System.out.println(listCarros.indexOf(new Carro("Carro3")));

		System.out.println(listCarros.remove(2));
		System.out.println(listCarros);
	}

}
