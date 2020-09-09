package edu.unah.poo;

public class BuzzLightYear extends JugueteVolador{
	final private String nombre= "BuzzLightYear";
	private int anioLanzamiento;

	public BuzzLightYear(int anioLanzamiento) {
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
		System.out.println("Hola soy BuzzLightYear,"
				+ "mi sector esta en el cuadrante Gama");
	}

	@Override
	public void volar() {
		System.out.println("Al infinito y mas alla");
		
	}
	
}
