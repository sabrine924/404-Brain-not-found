package com.esprit.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_ADMIN")
public class Administrator implements Serializable {
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long cin;
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mail_adress")
	private String email;
	
	@Column(name="phone_number")
	private int number;

	
	
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(long cin, String firstName, String lastName, String email, int number) {
		super();
		this.cin = cin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return "  cin  "+ cin +"  fisrt name  "+ firstName +"  last name  "+ lastName +"  email  "+ email +"  number  "+ number;
	}
	
}
