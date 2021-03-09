package com.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.esprit.spring.Entity.Parent;


@Repository
public interface ParentRepository extends  CrudRepository<Parent, Long > {


	
}
