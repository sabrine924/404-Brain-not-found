package com.esprit.spring.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "T_Reclamation")
public class Reclamation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
private Long id;
	@Column(name="Transmitter_id")
	private Long transmitter_id;
	@Column(name="Emitter_id")
	private Long emitter_id;
	@Column(name="Subject")
	private String subject;
	@Column(name="Description")
	private String description;
	@Temporal(TemporalType.DATE)
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTransmitter_id() {
		return transmitter_id;
	}
	public void setTransmitter_id(Long transmitter_id) {
		this.transmitter_id = transmitter_id;
	}
	public Long getEmitter_id() {
		return emitter_id;
	}
	public void setEmitter_id(Long emitter_id) {
		this.emitter_id = emitter_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
