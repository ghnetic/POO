package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Cliente;
import edu.unah.poo.repository.RepositoryCliente;

@Service
public class ServiceCliente {

	@Autowired 
	RepositoryCliente repositoryCliente;
	
	public void crearCliente(Cliente cliente) {
		this.repositoryCliente.save(cliente);
	}
	
	public Cliente buscarCliente(int id) {
		return this.repositoryCliente.findById(id);
	} 
	
	public List<Cliente> obtenerClientes(){
		return this.repositoryCliente.findAll();
	}
	
}
