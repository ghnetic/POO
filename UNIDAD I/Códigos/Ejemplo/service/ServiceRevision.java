package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.IdRevision;
import edu.unah.poo.model.Revision;
import edu.unah.poo.repository.RepositoryRevision;

@Service
public class ServiceRevision {

	@Autowired 
	RepositoryRevision repositoryRevision;
	
	public void crearRevision(Revision revision) {
		this.repositoryRevision.save(revision);
	}
	
	public Revision buscarRevision(IdRevision revisionId) {
		return this.repositoryRevision.getOne(revisionId);
	}
	
	public List<Revision> obtenerTodasRevision(){
		return this.repositoryRevision.findAll();
	}
}
