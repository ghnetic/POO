package edu.unah.poo;

public abstract class Woody implements Juguete{
	final String nombre="Woody";
	private int anioLanzamiento;
	
	public Woody(int anioLanzamiento) {
		super();
		this.anioLanzamiento = anioLanzamiento;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public void hablar() {
		System.out.println("Tengo una serpiente en mi bota");

	}
	@Override
	public void desplazarse() {
		System.out.println("voy caminando");	
	}
}
