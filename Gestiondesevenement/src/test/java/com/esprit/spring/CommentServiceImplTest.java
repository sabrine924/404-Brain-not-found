package com.esprit.spring;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.spring.Entity.Comment;
import com.esprit.spring.Service.ICommentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceImplTest {
	  
	private static final Logger L = LogManager.getLogger(CommentServiceImplTest.class);

	public static Logger getL() {
		return L;
	}
	
	@Autowired
	ICommentService cs;
	
	@Test
	public void TestAddComment(){
		Comment  c = new  Comment ((long) 1,"c'est interessant");
		cs.saveComment(c);
		
	}
	@Test 
	public void TestDeltetComment(){
		cs.deleteById("2");
	}

	
}
