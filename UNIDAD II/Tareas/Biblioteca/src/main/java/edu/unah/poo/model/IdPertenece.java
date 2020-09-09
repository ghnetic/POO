package edu.unah.poo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class IdPertenece implements Serializable{


	private int idLibro;
	private int idGenero;
	
	public IdPertenece() {}
	
	
	public IdPertenece(int idLibro, int idGenero) {
		super();
		this.idLibro = idLibro;
		this.idGenero = idGenero;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdPertenece) {
			IdPertenece tmpid = (IdPertenece)obj;
			if(this.idLibro == tmpid.getIdLibro()
				&& this.idGenero == tmpid.getIdGenero()) {
				return true;
			}else 
				return false;
		}else return false;
		
	}
	
	
	public int hashCode() {
		return this.idLibro+this.idGenero;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public int getIdGenero() {
		return idGenero;
	}


	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	
	
	
	
	
}
