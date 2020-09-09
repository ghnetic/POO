package edu.unah.poo;

public abstract class JugueteVolador implements Juguete{
	//Creamos un metodo abstacto para heredarlo
	//a otra clase
	public abstract void volar();
	
	//Se utiliza solo void porque lo implementa de
	//interface Juguete
	public void desplazarse() {
		System.out.println("en camino");
	}

	public void hablar() {
		// TODO Auto-generated method stub
	}
}
