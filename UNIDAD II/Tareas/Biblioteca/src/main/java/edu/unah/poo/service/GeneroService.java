package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Genero;
import edu.unah.poo.repository.GeneroRepository;

@Service
public class GeneroService {
	@Autowired
	private GeneroRepository generoRepository; 
	
	
	public void crearGenero(Genero genero) {
		this.generoRepository.saveAndFlush(genero);
	} 
	
	public List<Genero> obtenerGeneros(){
		return this.generoRepository.findAll();
	}
	
	public Genero buscarGenero(int idGenero) {
		return this.generoRepository.findById(idGenero);
	}
	
	public void eliminarGenero(int idGenero) {
		this.generoRepository.deleteById(idGenero);
	}
	
	public void eliminarGeneros() {
		this.generoRepository.deleteAll();
	}
	
	
}