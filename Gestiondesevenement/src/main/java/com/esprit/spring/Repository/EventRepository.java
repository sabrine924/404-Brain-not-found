package com.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.esprit.spring.Entity.Event;

@Repository
public interface EventRepository extends  CrudRepository<Event, Long > {


}
