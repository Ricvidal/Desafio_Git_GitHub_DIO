package br.com.dio;

import br.com.dio.model.Gato;

public class AtividadeDioJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gato gato1 = new Gato("Pichano", "pardo", 1);
		System.out.println(gato1);
		System.out.println("O Nome do gato é: "+ gato1.getNome());
		System.out.println(gato1.toString());
		
		
		int a = 5;
		int b = 10;
		System.out.println("Vamos que vamos!! "+ (a+b));
	}

}
