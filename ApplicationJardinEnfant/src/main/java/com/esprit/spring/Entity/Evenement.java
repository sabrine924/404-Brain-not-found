package com.esprit.spring.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "T_Events")
public class Evenement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private  int  idEvent;
	@Column(name="Subject")
	 private String Subject;
	@Column(name="Description")
	 private String Description;
	@Column(name="heure_debut")
	 private int begininghour;
	@Column(name="heure_fin")
	 private int endtime;
	@Column(name="Date")
	 private Date  date;
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getBegininghour() {
		return begininghour;
	}
	public void setBegininghour(int begininghour) {
		this.begininghour = begininghour;
	}
	public int getEndtime() {
		return endtime;
	}
	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Evenement [idEvent=" + idEvent + ", Subject=" + Subject + ", Description=" + Description
				+ ", begininghour=" + begininghour + ", endtime=" + endtime + ", date=" + date + "]";
	}
	
	 

	
}
