package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Auto;

public interface RepositoryAuto extends JpaRepository<Auto,Integer>{
	public Auto findById(int id);
}
