package com.esprit.spring.Service;


import java.util.List;

import com.esprit.spring.Entity.Reclamation;


public interface IReclamationService {
	Reclamation addReclamation(Reclamation r);
	void deleteReclamation(String id);
	Reclamation updateReclamation(Reclamation r);
	List<Reclamation> retrieveAllReclamations();



}
