package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class AtividadeDioJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Livro livro1 = new Livro("Como aprender Java","","");
		System.out.println("O endereço da memória onde está o livro é: " + livro1);
		
		Gato gato1 = new Gato("Pichano", "pardo", 1);
		System.out.println(gato1);
		System.out.println("O Nome do gato é: "+ gato1.getNome());
		System.out.println(gato1.toString());
		
		
		int a = 5;
		int b = 10;
		System.out.println("Vamos que vamos!! "+ (a+b));
	}

}
