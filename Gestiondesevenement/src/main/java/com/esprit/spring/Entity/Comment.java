package com.esprit.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="comments")

public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="Comments")
	private String content;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	


	public Comment() {
	 
	}


	public Comment(Long id, String content) {
		this.id = id;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", event=" + event + ", commenter=" + commenter + "]";
	}



	@ManyToOne(fetch=FetchType.LAZY)
	private Event event;
	@ManyToOne(fetch=FetchType.LAZY)
	private Parent commenter;


	public Parent getCommenter() {
		return commenter;
	}

	public void setCommenter(Parent commenter) {
		this.commenter = commenter;
	}
	

}
