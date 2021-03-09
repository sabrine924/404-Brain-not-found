package com.esprit.spring.Service;

import java.util.List;
import java.util.Optional;
import com.esprit.spring.Entity.Event;


public interface IEventService {
	
	  Event  addEvents(Event E);
	  void    deleteEventById(String idEvent);
	  Event  updateEvents(Event E);
	  List<Event> retrieveAllEvents();
	  Optional<Event> retrieveEvents(String id);
	 void parentJoinEvent(Long identif, Long idEvent);
	  void cancelUserAttendance(Long identif, Long idEvent);
	 
	  
	

	

	
}
