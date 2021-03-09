package com.esprit.spring.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PARENT")
public class Parent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
private Long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="phone")
	private String phone;
	@Column(name="Email")
	private String email;
	@Column(name="Adress")
	private String adress;
	@Column(name="Firstname_child")
	private String firstname_child;
	@Column(name="Age")
	private Long age;
	@Column(name="Health")
	private String health;
	@Column(name="Lastname_child")
	private String lastname_child;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getFirstname_child() {
		return firstname_child;
	}
	public void setFirstname_child(String firstname_child) {
		this.firstname_child = firstname_child;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getLastname_child() {
		return lastname_child;
	}
	public void setLastname_child(String lastname_child) {
		this.lastname_child = lastname_child;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
