package com.derbala.helpus.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProposeServiceCustomerId  implements Serializable {
	
	
	private static final long serialVersionUID =1L;
	private Service serviceProposed;
	private Customer customer;
	private LocalDateTime date_creation;

	public ProposeServiceCustomerId() {
		super();
	}
	public ProposeServiceCustomerId(Service serviceProposed, Customer customer) {
		super();
		this.serviceProposed = serviceProposed;
		this.customer = customer;
		this.date_creation = LocalDateTime.now() ;
	}
	
	@ManyToOne
	public Service getServiceProposed() {
		return serviceProposed;
	}
	public void setServiceProposed(Service serviceProposed) {
		this.serviceProposed = serviceProposed;
	}
	
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Column (name="creation_date")
	public LocalDateTime getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(LocalDateTime date_creation) {
		this.date_creation = date_creation;
	}



	
	
	
	

}
