package com.esprit.project.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="T_KinderGarden")
public class KinderGarden extends User implements Serializable {
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	public KinderGarden(long id, String firstName, String lastName, int phone, String email, String adress, long id2) {
		super(id, firstName, lastName, phone, email, adress);
		id = id2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
