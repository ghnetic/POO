package edu.unah.poo.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class IdRevision implements Serializable{


	private int idAuto;
	private int idMecanico;
	private LocalDate fecha;
	
	public IdRevision() {}
	
	public IdRevision(int idAuto, int idMecanico, LocalDate fecha) {
		super();
		this.idAuto = idAuto;
		this.idMecanico = idMecanico;
		this.fecha = fecha;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdRevision) {
			IdRevision tmpid = (IdRevision)obj;
			if(this.idAuto == tmpid.getIdAuto()
				&& this.idMecanico == tmpid.getIdMecanico()
				&& this.fecha.compareTo(tmpid.getFecha())==0) {
				return true;
			}else 
				return false;
		}else return false;
		
	}
	
	
	public int hashCode() {
		return (int) this.fecha.hashCode()+this.idAuto+this.idMecanico;
	}
	
	public int getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}
	public int getIdMecanico() {
		return idMecanico;
	}
	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
}
