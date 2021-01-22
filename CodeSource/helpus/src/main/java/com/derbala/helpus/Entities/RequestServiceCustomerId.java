package com.derbala.helpus.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class RequestServiceCustomerId  implements Serializable {
	
	
	private static final long serialVersionUID =5L;
	private Service serviceRequested;
	private Customer customer;
	private LocalDateTime date_creation;

	public RequestServiceCustomerId() {
		super();
	}
	public RequestServiceCustomerId(Service serviceProposed, Customer customer) {
		super();
		this.serviceRequested = serviceProposed;
		this.customer = customer;
		this.date_creation = LocalDateTime.now() ;
	}
	
	@ManyToOne
	public Service getServiceProposed() {
		return serviceRequested;
	}
	public void setServiceProposed(Service serviceProposed) {
		this.serviceRequested = serviceProposed;
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
