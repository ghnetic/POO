package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.IdRevision;
import edu.unah.poo.model.Revision;

public interface RepositoryRevision  extends JpaRepository<Revision,IdRevision>{

}
