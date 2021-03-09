package com.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.Entity.Reclamation;
import com.esprit.spring.Service.IReclamationService;

@RestController
public class ReclamationRestController {
	@Autowired
	IReclamationService reclamationService;
	//http://localhost:8081/SpringMVC/servlet/retrieve-all-reclamations
	@GetMapping("/retrieve-all-reclamations")
	@ResponseBody
	public List<Reclamation> getReclamations() {
	List<Reclamation> list = reclamationService.retrieveAllReclamations();
	return list;
	}
	

	//http://localhost:8081/SpringMVC/servlet/add-reclamation
	@PostMapping("/add-reclamation")
	@ResponseBody
	public Reclamation addReclamation(@RequestBody Reclamation r) {
	Reclamation reclamation = reclamationService.addReclamation(r);
	return reclamation;
	}
	}



