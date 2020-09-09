package edu.unah.poo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.poo.model.Auto;
import edu.unah.poo.model.Cliente;
import edu.unah.poo.model.IdRevision;
import edu.unah.poo.model.Mecanico;
import edu.unah.poo.model.Revision;
import edu.unah.poo.service.ServiceCliente;
import edu.unah.poo.service.ServiceMecanico;
import edu.unah.poo.service.ServiceRevision;
import edu.unah.poo.service.serviceAuto;

@RestController
public class Controlador {
		@Autowired
		serviceAuto serviceauto;
		@Autowired
		ServiceCliente serviceCliente;
		
		@Autowired
		ServiceMecanico serviceMecanico;
		
		@Autowired
		ServiceRevision serviceRevision;
		
		//====================================================================
		//  Mecánico
		//====================================================================
		
		@RequestMapping(value ="/mecanico/crearMecanico",method=RequestMethod.GET)
		public Mecanico crearMecanico(@RequestParam(name = "id") int idMecanico,
			                          @RequestParam(name = "nombre") String nombre,
			                          @RequestParam(name = "usuario") String usuario,
			                          @RequestParam(name = "contrasenia") String contrasenia,
			                          @RequestParam(name = "rol") String rol) {
			Mecanico mecanico = new Mecanico( idMecanico, nombre,usuario, contrasenia,rol);
			this.serviceMecanico.crearMecanico(mecanico);
			return mecanico;
			
		}
		
		
		@RequestMapping(value ="/mecanico/listaMecanico",method=RequestMethod.GET)
		public List<Mecanico> listadoMecanico() {
			return this.serviceMecanico.obtenerTodosMecanicos();
		}
		
		@RequestMapping(value ="/mecanico/buscarMecanico",method=RequestMethod.GET)
		public Mecanico buscarMecanico(@RequestParam(name = "id") int idMecanico) {
			return this.serviceMecanico.buscarMecanico( idMecanico);
		}
     	//=======================================================================
		//Clientes
		//======================================================================
		@RequestMapping (value = "/cliente/crearCliente",method=RequestMethod.GET)
		public Cliente crearCliente(@RequestParam(name = "id") int idCliente,
				                    @RequestParam(name = "nombre") String nombre,
				                    @RequestParam(name = "direccion") String direccion,
				                    @RequestParam(name = "telefono") String telefono) {
			 
			Cliente tmpCliente = new Cliente(idCliente,nombre,direccion,telefono);
			this.serviceCliente.crearCliente(tmpCliente);
			return tmpCliente;
		}
		
		@RequestMapping(value = "/cliente/listarCliente",method=RequestMethod.GET)
		public List<Cliente> listarClientes(){
			return this.serviceCliente.obtenerClientes();
		}
		
		//=======================================================================
		//Autos
		//======================================================================
		@RequestMapping (value = "/auto/crearAuto",method=RequestMethod.GET)
		public Auto crearAuto(@RequestParam(name = "id") int idAuto,
				                 @RequestParam(name = "tipo") String tipo,
				                 @RequestParam(name = "anio") int direccion,
				                 @RequestParam(name = "idCliente") int idcliente) {
			
			Cliente c = this.serviceCliente.buscarCliente(idcliente);
			Auto tmpAuto = new Auto(idAuto,tipo,direccion,c);
			this.serviceauto.crearAuto(tmpAuto);
			return tmpAuto;
		}
		
		@RequestMapping(value = "/auto/listarAuto",method=RequestMethod.GET)
		public List<Auto> listarAuto(){
			return this.serviceauto.obtenerAutos();
		}
		
		//=======================================================================
		//Revision
		//======================================================================
		@RequestMapping (value = "/revision/crearRevision",method=RequestMethod.GET)
		public Revision crearRevision(@RequestParam(name = "idAuto") int idAuto,
				                      @RequestParam(name = "idMecanico") int idMecanico,
				                      @RequestParam(name = "fechaRevision") @DateTimeFormat(iso = ISO.DATE)  LocalDate fechaRevision,
				                      @RequestParam(name = "precio") double precio,
				                      @RequestParam(name = "descripcion") String descripcion) {
			
			
			Auto auto = this.serviceauto.buscarAuto(idAuto);
			Mecanico mecanico = this.serviceMecanico.buscarMecanico(idMecanico);
			
			
			Revision tmpRevision = new Revision(idAuto, idMecanico, fechaRevision,precio, descripcion, auto,mecanico);
			
			
			
			this.serviceRevision.crearRevision(tmpRevision);
			
			return tmpRevision;
		}

		@RequestMapping(value = "/revision/buscar",method=RequestMethod.GET)
		public Revision buscarRevision(@RequestParam(name = "idAuto") int idAuto,
						                @RequestParam(name = "idMecanico") int idMecanico,
						                @RequestParam(name = "fechaRevision") @DateTimeFormat(iso = ISO.DATE)  LocalDate fechaRevision
						                ){
			IdRevision idRevision = new IdRevision(idAuto, idMecanico, fechaRevision);
			return this.serviceRevision.buscarRevision(idRevision);
		}
		
		@RequestMapping(value = "/revision/listarRevision",method=RequestMethod.GET)
		public List<Revision> listarRevision(){
			return this.serviceRevision.obtenerTodasRevision();
		}

		
		
}
