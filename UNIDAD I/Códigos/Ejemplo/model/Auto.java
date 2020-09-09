package edu.unah.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "auto")
public class Auto {
	@Id
	private int idAuto;
	private String Tipo;
	private int anio;
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	@JsonBackReference
	private Cliente cliente;
	
	public Auto() {}
	
	public Auto(int idAuto, String tipo, int anio, Cliente cliente) {
		super();
		this.idAuto = idAuto;
		Tipo = tipo;
		this.anio = anio;
		this.cliente = cliente;
	}

	public int getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
}
