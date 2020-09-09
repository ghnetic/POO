package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Mecanico;

public interface RepositoryMecanico  extends JpaRepository<Mecanico, Integer>{
	public Mecanico findById(int id);
}
