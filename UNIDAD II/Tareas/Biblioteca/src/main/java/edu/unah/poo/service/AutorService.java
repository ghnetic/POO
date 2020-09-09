package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Autor;
import edu.unah.poo.repository.AutorRepository;

@Service
public class AutorService {
	@Autowired
	private AutorRepository autorRepository; 
	
	
	public void crearAutor(Autor autor) {
		this.autorRepository.save(autor);
	} 
	
	public List<Autor> obtenerTodosAutores(){
		return this.autorRepository.findAll();
	}
	
	public Autor buscarAutor(int idAutor) {
		return this.autorRepository.findById(idAutor);
	}
	
	public void eliminarAutor(int idAutor) {
		this.autorRepository.deleteById(idAutor);;
	}
	
	public void eliminarTodosAutores() {
		this.autorRepository.deleteAll();
	}
	
	public void actualizarNombre(String nombre, int idAutor) {
		this.autorRepository.actualizarNombre(nombre, idAutor);
	}
	
	
}