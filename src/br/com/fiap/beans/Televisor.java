package br.com.fiap.beans;

public class Televisor {

	private int canal;
	private int volume;
	private boolean ligado;
	
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
		if (this.volume > 0 && this.volume < 10)
     		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	public void ligar() {
		System.out.println("Ligando a TV...");
		this.ligado = true;
	}
	
	public void desligar() {
		System.out.println("Desligando a TV...");
		this.ligado = false;		
	}
	
	public void mostrarStatus() {
		System.out.println("Canal: " + this.canal +
				           " / Vol: " + this.volume +
				           " / Ligado: " + this.ligado );
	}
	
	public void aumentarVolume() {
		if (this.volume < 10) {
			this.volume = this.volume + 1;			
		}
		System.out.println("Volume ++");
	}
	
	public void diminuirVolume() {
		setVolume(getVolume() - 1);
		System.out.println("Volume --");
	}
	
}
