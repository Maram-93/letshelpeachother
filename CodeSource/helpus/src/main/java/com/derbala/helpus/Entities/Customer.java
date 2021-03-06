package com.derbala.helpus.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long id;
	private String login;
	private String email;
	private String job;
	private Date creationDate;
	
	public Customer() {
		super();
	}
	public Customer(long id, String login, String email, String job, Date creationDate) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.job = job;
		this.creationDate = creationDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "LOGIN", nullable = false)
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "JOB")
	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(name = "CREATION_DATE", nullable = false)
	public Date getCreationDate() {
		return this.creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
