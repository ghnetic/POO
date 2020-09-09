package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Cliente;

public interface RepositoryCliente  extends JpaRepository<Cliente, Integer>{
	public Cliente findById(int id);
}
