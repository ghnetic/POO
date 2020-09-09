package edu.unah.poo;

public class Main {

	public static void main(String[] args) {
		//Creamos nuestro primer elemento
		Juguete J1= new BuzzLightYear(2014);
		JugueteVolador J2= new BuzzLightYear(2015);
		BuzzLightYear J3= new BuzzLightYear(2016);
		
		//Veamos los metodos de cada juguete
		System.out.println("Juguete 1");
		J1.hablar();
		System.out.println("Juguete 2");
		J2.volar();
		System.out.println("Juguete 3");
		System.out.println(J3.getNombre());
		
	}

}
