package edu.unah.poo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import edu.unah.poo.model.Autor;
import edu.unah.poo.model.Genero;

public interface GeneroRepository  extends JpaRepository<Genero, Integer>{
	public Genero findById(int idGenero);
	
}