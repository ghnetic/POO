package edu.unah.poo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="pretenece")
@IdClass(IdPertenece.class)
public class Pertenece implements Serializable{

	@Id
	private int idLibro;
	@Id
	private int idGenero;

	public Pertenece() {}
	

	public Pertenece(int idLibro, int idGenero, Libro libro, Genero genero) {
		super();
		this.idLibro = idLibro;
		this.idGenero = idGenero;
		this.libro = libro;
		this.genero = genero;
	}

	
	@ManyToOne
	@JoinColumn(name="idLibro", referencedColumnName="idLibro", insertable = false, updatable = false)
	@JsonBackReference
	private Libro libro;
	
	@ManyToOne
	@JoinColumn(name="idGenero", referencedColumnName="idGenero", insertable = false, updatable = false)
	@JsonBackReference
	private Genero genero;


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


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}	
	
}
