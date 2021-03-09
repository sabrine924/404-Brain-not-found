package com.esprit.spring.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "T_Parents")

public class Parent  {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private  Long identif;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String Email;
	@Column(name="phone")
	private int phone;
	@Column(name="login")
	private String Login;
	@Column(name="password")
	private String Password;
	@Column(name="kindergartenid")
	private String kindergartenid;
	public Long getIdentif() {
		return identif;
	}
	public void setIdentif(Long identif) {
		this.identif = identif;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getKindergartenid() {
		return kindergartenid;
	}
	public void setKindergartenid(String kindergartenid) {
		this.kindergartenid = kindergartenid;
	}
	public Parent(Long identif, String firstname, String lastname, String email, int phone, String login,
			String password, String kindergartenid) {
		
		this.identif = identif;
		this.firstname = firstname;
		this.lastname = lastname;
		Email = email;
		this.phone = phone;
		Login = login;
		Password = password;
		this.kindergartenid = kindergartenid;
	}
	public Parent() {
	
	}
	@ManyToMany(mappedBy="Parents",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Event> events;
	@OneToMany(mappedBy="commenter", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Comment> comments;
	
	
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	


}
