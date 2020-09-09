package edu.unah.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "libro")
public class Libro {
	@Id
	private int idLibro;
	private String nombre;
	private int anio;
	
	@ManyToOne
	@JoinColumn(name="idAutor")
	@JsonBackReference
	private Autor autor;
	
	public Libro() {}

	public Libro(int idLibro, String nombre, int anio, Autor autor) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.anio = anio;
		this.autor = autor;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
