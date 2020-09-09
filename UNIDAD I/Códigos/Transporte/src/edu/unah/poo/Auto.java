package edu.unah.poo;

import java.time.LocalDate;
import java.time.Period;

public class Auto implements Vehiculo{
	private String marca;
	private LocalDate fechaMantenimiento;
	private String nombre;
	final private int mesesMantenimiento=4;
	
	public Auto(String marca, LocalDate fechaMantenimiento, String nombre) {
		super();
		this.marca = marca;
		this.fechaMantenimiento = fechaMantenimiento;
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
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
