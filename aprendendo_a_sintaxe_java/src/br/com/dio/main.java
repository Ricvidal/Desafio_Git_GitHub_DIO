package br.com.dio;

import br.com.dio.model.SmartTv;

public class main {

	public static void main(String[] args) {

		SmartTv tv1 = new SmartTv();

		tv1.ligarTv();

		System.out
				.println("O status da SmartTV é: " + tv1.isLigada() + "- Canal: " + tv1.getCanal() + "- Volume: " + tv1.getVolume());

		tv1.desligarTv();

		System.out
				.println("O status da SmartTV é: " + tv1.isLigada() + "- Canal: " + tv1.getCanal() + "- Volume: " + tv1.getVolume());

	}

}
