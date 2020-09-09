package edu.unah.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mecanico")
public class Mecanico {
	@Id
	private int idMecanico;
	private String nombre;
	private String usuario;
	private String contrasenia;
	private String Rol;
	
	public Mecanico() {}
	
	
	public Mecanico(int idMecanico, String nombre, String usuario, String contrasenia, String rol) {
		super();
		this.idMecanico = idMecanico;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		Rol = rol;
	}
	public int getIdMecanico() {
		return idMecanico;
	}
	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	
	
	
}
