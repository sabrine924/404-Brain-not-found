package com.esprit.spring.Service;


import com.esprit.spring.Entity.Comment;

public interface ICommentService {
          
	void saveComment(Comment c);
	public void  deleteById(String id);
}
