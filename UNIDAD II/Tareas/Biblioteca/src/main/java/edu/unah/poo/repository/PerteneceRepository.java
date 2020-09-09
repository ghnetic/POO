package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.IdPertenece;
import edu.unah.poo.model.Pertenece;

public interface PerteneceRepository  extends JpaRepository<Pertenece,IdPertenece>{

}