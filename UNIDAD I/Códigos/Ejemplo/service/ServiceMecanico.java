package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Mecanico;
import edu.unah.poo.repository.RepositoryMecanico;

@Service
public class ServiceMecanico {
	@Autowired
	RepositoryMecanico repositoryMecacnico; 
	
	
	public void crearMecanico(Mecanico mecanico) {
		this.repositoryMecacnico.save(mecanico);
	} 
	
	public List<Mecanico> obtenerTodosMecanicos(){
		return this.repositoryMecacnico.findAll();
	}
	
	public Mecanico buscarMecanico(int id) {
		return this.repositoryMecacnico.findById(id);
	}
}
