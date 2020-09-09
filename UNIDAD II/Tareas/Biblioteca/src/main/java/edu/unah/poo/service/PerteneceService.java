package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.IdPertenece;
import edu.unah.poo.model.Pertenece;
import edu.unah.poo.repository.PerteneceRepository;

@Service
public class PerteneceService {

	@Autowired 
	private PerteneceRepository perteneceRepository;
	
	public void crearPertenece(Pertenece pertenece) {
		this.perteneceRepository.save(pertenece);
	}
	
	public Pertenece buscarPertenece(IdPertenece perteneceId) {
		return this.perteneceRepository.getOne(perteneceId);
	}
	
	public List<Pertenece> obtenerTodosPertenece(){
		return this.perteneceRepository.findAll();
	}
}
