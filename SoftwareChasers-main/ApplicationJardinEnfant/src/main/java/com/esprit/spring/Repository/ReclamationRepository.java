package com.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.spring.Entity.Reclamation;
@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, String> {

}
