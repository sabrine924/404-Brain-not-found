package com.esprit.project.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="T_Delegate")
public class Delegate extends Parent implements Serializable {
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	public Delegate(long id, String firstName, String lastName, int phone, String email, String adress, long id2,
			String firstNameChild, String lastNameChild, String age, String health, long id3) {
		super(id, firstName, lastName, phone, email, adress, id2, firstNameChild, lastNameChild, age, health);
		id = id3;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
