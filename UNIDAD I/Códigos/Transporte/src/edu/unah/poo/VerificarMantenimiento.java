package edu.unah.poo;

public class VerificarMantenimiento {
	
	public void verificarMantenimiento(Vehiculo vehiculo) {
		if (vehiculo.mantenimiento()) {
			System.out.println(vehiculo.getNombre()+" esta en condiciones de salir");
		}else {
			System.out.println(vehiculo.getNombre()+" necesita mantenimiento.");
		}
	}
}
