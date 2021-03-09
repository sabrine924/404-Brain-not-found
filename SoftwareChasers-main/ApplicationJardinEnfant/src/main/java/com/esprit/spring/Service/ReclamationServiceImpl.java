package com.esprit.spring.Service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.Entity.Reclamation;
import com.esprit.spring.Repository.ReclamationRepository;
@Service


public class ReclamationServiceImpl implements IReclamationService {
	@Autowired
	ReclamationRepository reclamationRepository;
private static final Logger L = LogManager.getLogger(ReclamationServiceImpl.class);
@Override
public List<Reclamation> retrieveAllReclamations() {
	List<Reclamation> reclamations = (List<Reclamation>) reclamationRepository.findAll();
	for (Reclamation reclamation: reclamations) {
		L.info("reclamation : " + reclamation);
	}
	return reclamations;}

@Override
public Reclamation addReclamation(Reclamation r) {
	return reclamationRepository.save(r);
}
@Override
public void deleteReclamation(String subject) {
	reclamationRepository.deleteById(subject);
}
@Override
public Reclamation updateReclamation(Reclamation r) {
	return reclamationRepository.save(r);	
}

}


