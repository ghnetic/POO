package edu.unah.poo;

import java.time.LocalDate;
import java.time.Period;

public class Bicicleta implements Vehiculo{
	private String tipo;
	private LocalDate fechaMantenimiento;
	private String nombre;
	final private int mesesMantenimiento= 12;
	
	public Bicicleta(String tipo, LocalDate fechaMantenimiento, String nombre) {
		super();
		this.tipo = tipo;
		this.fechaMantenimiento = fechaMantenimiento;
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaMantenimiento() {
		return fechaMantenimiento;
	}
	public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean mantenimiento() {
		LocalDate fechaActual= LocalDate.now();
		Period periodo= Period.between(this.fechaMantenimiento, fechaActual);
		if(periodo.toTotalMonths()<= this.mesesMantenimiento)
			return true;
		else
			return false;
	}
	
}
