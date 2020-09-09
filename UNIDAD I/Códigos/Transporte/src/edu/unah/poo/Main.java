package edu.unah.poo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Vehiculo rayoMcqueen= new Auto("Chevrolet",
				LocalDate.parse("2020-01-10"),"Rayo Mcqueen");
		
		Vehiculo mate= new Bicicleta("Montañosa",
				LocalDate.parse("2020-01-30"),"Soy Mate");
		
		VerificarMantenimiento verificar= new VerificarMantenimiento();
		System.out.println("Verificando los vehiculos...\n");
		verificar.verificarMantenimiento(rayoMcqueen);
		verificar.verificarMantenimiento(mate);
		
	}

}
