package edu.unah.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
		@Id
		private int idGenero;
		private String nombre;
		
		public Genero(int idGenero, String nombre) {
			super();
			this.idGenero = idGenero;
			this.nombre = nombre;
		}
		
		public Genero() {}

		public int getIdGenero() {
			return idGenero;
		}

		public void setIdGenero(int idGenero) {
			this.idGenero = idGenero;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		
}
