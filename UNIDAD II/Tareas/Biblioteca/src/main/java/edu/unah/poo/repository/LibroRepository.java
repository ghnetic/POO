package edu.unah.poo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import edu.unah.poo.model.Libro;

public interface LibroRepository extends JpaRepository<Libro,Integer>{
	public Libro findById(int id);
	
	@Transactional
	@Modifying
	@Query(value="update libro set nombre = ?1 where idLibro=?2", nativeQuery=true)
	public void actualizarLibro(String nombre, int idLibro);
	
}
