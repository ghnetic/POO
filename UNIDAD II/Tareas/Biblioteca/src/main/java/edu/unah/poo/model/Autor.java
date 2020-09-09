package edu.unah.poo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="autor")
public class Autor {
	@Id
	private int idAutor;
	private String nombre;
	private String direccion;
	
	@OneToMany(mappedBy="autor",fetch=FetchType.EAGER)
	private List<Libro> libro;
	
	public Autor() {}

	public Autor(int idAutor, String nombre, String direccion) {
		super();
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Autor(int idAutor, String nombre) {
		super();
		this.idAutor = idAutor;
		this.nombre = nombre;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}