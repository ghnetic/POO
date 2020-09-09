package edu.unah.poo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import edu.unah.poo.model.Autor;

public interface AutorRepository  extends JpaRepository<Autor, Integer>{
	public Autor findById(int idAutor);
	
	@Transactional
	@Modifying
	@Query(value="update autor set nombre = ?1 where idAutor=?2", nativeQuery=true)
	public void actualizarNombre(String nombre, int idAutor);
	
	
	/*
	 * 
	 * Quise crear una instruccion para hacer un inner join que solo mostrara el nombre del Autor y el libro que creó.
	 * Pero no me funcionó. 
	 * 
	@Transactional
	@Modifying
	@Query(value="select a.nombre, l.nombre from autor as a inner join libro as l on a.idAutor=l.idAutor;", nativeQuery=true)
	public Autor verAutorLibro(int idAutor);
*/
}
