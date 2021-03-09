package com.esprit.spring.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.spring.Entity.Comment;

@Repository
public interface CommentRepositroy  extends CrudRepository<Comment , Long> {


	
	
}
