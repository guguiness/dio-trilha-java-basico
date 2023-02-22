package edu.dio.anatomiadeclasses;

public class Nome {

	public static void main(String[] args) {
		String primeiroNome = "Gustavo";
		String segundoNome = "Nogueira";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println("Nome completo: " + nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
