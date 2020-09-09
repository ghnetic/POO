package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Auto;
import edu.unah.poo.repository.RepositoryAuto;

@Service
public class serviceAuto {
	@Autowired 
	RepositoryAuto repositoryAuto;
	
	public void crearAuto(Auto auto) {
		this.repositoryAuto.save(auto);
	}
	
	public List<Auto> obtenerAutos() {
		return this.repositoryAuto.findAll();
	}
	
	public Auto buscarAuto(int id) {
		return this.repositoryAuto.findById(id);
	}
	
}
