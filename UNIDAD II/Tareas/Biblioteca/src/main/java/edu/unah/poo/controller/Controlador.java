package edu.unah.poo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.unah.poo.model.Autor;
import edu.unah.poo.model.Genero;
import edu.unah.poo.model.IdPertenece;
import edu.unah.poo.model.Libro;
import edu.unah.poo.model.Pertenece;
import edu.unah.poo.service.AutorService;
import edu.unah.poo.service.GeneroService;
import edu.unah.poo.service.LibroService;
import edu.unah.poo.service.PerteneceService;


@RestController
public class Controlador {
	@Autowired
	private AutorService autorService;
	@Autowired
	private GeneroService generoService;
	
	@Autowired
	private LibroService libroService;
	@Autowired
	private PerteneceService perteneceSevice;
	
	//====================================================================
	//  CREACION DE LOS AUTORES DE LOS LIBROS
	//====================================================================
	
	@RequestMapping(value ="/autor/crearAutor",method=RequestMethod.GET)
	public Autor crearAutor(@RequestParam(name = "id") int idAutor,
		                          @RequestParam(name = "nombre") String nombre,
		                          @RequestParam(name = "direccion") String direccion) {
		Autor autor = new Autor( idAutor, nombre,direccion);
		this.autorService.crearAutor(autor);
		return autor;
	}
	
	@RequestMapping(value ="/autor/listaAutores",method=RequestMethod.GET)
	public List<Autor> listadoAutores() {
		return this.autorService.obtenerTodosAutores();
	}
	
	@RequestMapping(value ="/autor/buscarAutor",method=RequestMethod.GET)
	public Autor buscarAutor(@RequestParam(name = "id") int idAutor) {
		return this.autorService.buscarAutor( idAutor);
	}
	
	@RequestMapping(value="/autor/eliminarAutor", method=RequestMethod.GET)
	public String eliminarAutor(@RequestParam(name="id") int idAutor) {
		this.autorService.eliminarAutor(idAutor);
		return "Se ha eliminado el Autor satisfactoriamente";
	}
	
	@RequestMapping(value="/autor/eliminarAutores", method=RequestMethod.GET)
		public String eliminarAutores() {
			this.autorService.eliminarTodosAutores();
			return "Se han eliminado TODOS los autores";
	}
	
	
	@RequestMapping(value="/autor/actualizarAutor", method=RequestMethod.GET)
	public void actualizarNombre(@RequestParam(name="nombre")String nombre,
								@RequestParam(name="idAutor")int idAutor) {
		this.autorService.actualizarNombre(nombre, idAutor);
		
	}
	
	
	
 	//=======================================================================
	//GENERO DE LOS LIBROS
	//======================================================================
	@RequestMapping (value = "/genero/crearGenero",method=RequestMethod.GET)
	public Genero crearGenero(@RequestParam(name = "idGenero") int idGenero,
			                    @RequestParam(name = "nombre") String nombre) {
		 
		Genero genero = new Genero(idGenero,nombre);
		this.generoService.crearGenero(genero);
		return genero;
	}
	
	@RequestMapping(value = "/genero/listarGenero",method=RequestMethod.GET)
	public List<Genero> listarGeneros(){
		return this.generoService.obtenerGeneros();
	}
	

	@RequestMapping(value="/genero/eliminarGenero", method=RequestMethod.GET)
	public String eliminarGenero(@RequestParam(name="id") int idGenero) {
		this.generoService.eliminarGenero(idGenero);
		return "Se ha eliminado el Genero satisfactoriamente";
	}
	
	@RequestMapping(value="/genero/eliminarGeneros", method=RequestMethod.GET)
		public String eliminarGeneros() {
			this.generoService.eliminarGeneros();
			return "Se han eliminado TODOS los generos";
	}
	
	
	
	//=======================================================================
	//LIBROS DISPONIBLES
	//======================================================================
	@RequestMapping (value = "/libros/crearLibros",method=RequestMethod.GET)
	public Libro crearLibro(@RequestParam(name = "idLibro") int idLibro,
			                 @RequestParam(name = "nombre") String nombre,
			                 @RequestParam(name = "anio") int anio,
			                 @RequestParam(name = "idAutor") int idAutor) {
		
		Autor autor = this.autorService.buscarAutor(idAutor);
		Libro libro = new Libro(idLibro,nombre,anio,autor);
		this.libroService.crearAuto(libro);
		return libro;
	}
	
	@RequestMapping(value = "/libros/listarLibros",method=RequestMethod.GET)
	public List<Libro> listarLibros(){
		return this.libroService.obtenerLibros();
	}
	
	@RequestMapping(value="/libros/eliminarLibro", method=RequestMethod.GET)
	public String eliminarLibro(@RequestParam(name="idLibro")int idLibro) {
		this.libroService.eliminarLibro(idLibro);
		return "Se ha eliminado el libro satisfactoriamente";
		
	}
	
	@RequestMapping(value="/libros/eliminarLibros", method=RequestMethod.GET)
	public String eliminarLibros() {
		this.libroService.eliminarLibros();
		return "TODOS los libros se han eliminado satisfactoriamente";
	}
	
	@RequestMapping(value="/libros/actualizarLibro", method=RequestMethod.GET)
	public void actualizarLibro(@RequestParam(name="nombre")String nombre,
								@RequestParam(name="idLibro")int idLibro) {
		this.libroService.actualizarLibro(nombre, idLibro);
		
	}
	
	//==================================================
	//PERTENECE
	//==================================================
	@RequestMapping (value = "/pertenece/crearPertenece",method=RequestMethod.GET)
	public Pertenece crearRevision(@RequestParam(name = "idLibro") int idLibro,
			                      @RequestParam(name = "idGenero") int idGenero) {
		
		
		Libro libro = this.libroService.buscarLibro(idLibro);
		Genero genero = this.generoService.buscarGenero(idGenero);
		
		
		Pertenece tmpRevision = new Pertenece(idLibro, idGenero, libro, genero);
		
		
		
		this.perteneceSevice.crearPertenece(tmpRevision);
		
		return tmpRevision;
	}

	@RequestMapping(value = "/pertenece/buscar",method=RequestMethod.GET)
	public Pertenece buscarRevision(@RequestParam(name = "idLibro") int idLibro,
					                @RequestParam(name = "idGenero") int idGenero){
		IdPertenece idPertenece = new IdPertenece(idLibro, idGenero);
		return this.perteneceSevice.buscarPertenece(idPertenece);
	}
	
	@RequestMapping(value = "/pertenece/listarPertenece",method=RequestMethod.GET)
	public List<Pertenece> listarPertenece(){
		return this.perteneceSevice.obtenerTodosPertenece();
	}

	
}
