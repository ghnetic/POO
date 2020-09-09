package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Libro;
import edu.unah.poo.repository.LibroRepository;

@Service
public class LibroService {
	@Autowired 
	LibroRepository libroRepository;
	
	public void crearAuto(Libro libro) {
		this.libroRepository.save(libro);
	}
	
	public List<Libro> obtenerLibros() {
		return this.libroRepository.findAll();
	}
	
	public Libro buscarLibro(int id) {
		return this.libroRepository.findById(id);
	}
	
	public void eliminarLibro(int id) {
		this.libroRepository.deleteById(id);
	}
	
	public void eliminarLibros() {
		this.libroRepository.deleteAll();
	}
	
	public void actualizarLibro(String nombre, int idLibro) {
		this.libroRepository.actualizarLibro(nombre, idLibro);
	}
	
}