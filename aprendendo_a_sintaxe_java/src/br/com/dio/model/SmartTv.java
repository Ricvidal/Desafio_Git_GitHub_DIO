package br.com.dio.model;

public class SmartTv {
	boolean ligada;
	int canal;
	int volume;

	public String isLigada() {
		if (ligada) {
			return "Ligada";
		} else {
			return "Desligada";
		}
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public SmartTv() {
		// TODO Auto-generated constructor stub
	}

	public SmartTv(boolean ligada, int canal, int volume) {

		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;

	}

	public void ligarTv() {
		this.setLigada(true);
		if (this.canal != 0) {
			this.setCanal(this.canal);
		} else {
			this.setCanal(25);
		}
		if (this.volume != 0) {
			this.setVolume(this.volume);
		} else {
			this.setVolume(15);
		}
	}

	public void desligarTv() {
		this.setLigada(false);
//		this.setCanal(0);
//		this.setVolume(0);
	}

}
