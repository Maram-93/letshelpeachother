package com.derbala.helpus.dto;

import java.util.Date;

import com.derbala.helpus.Entities.Customer;

public class CustomerDTO {

	private String login;

	private String email;
	private String job;
	private Date creationDate;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String login, String email, String job, Date creationDate) {
		super();
		this.login = login;
		this.email = email;
		this.job = job;
		this.creationDate = creationDate;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Customer convertCustomerDTOTOCustomer() {
		Customer customer = new Customer();
		customer.setLogin(this.login);
		customer.setJob(this.job);
		customer.setEmail(this.email);
		customer.setCreationDate(this.creationDate);

		return customer;
	}
}
