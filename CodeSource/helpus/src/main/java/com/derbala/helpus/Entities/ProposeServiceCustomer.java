package com.derbala.helpus.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="Propose_service_customer")
@AssociationOverrides({
@AssociationOverride(name = "pk.service", joinColumns = @JoinColumn(name = "SERVICE_ID")),
@AssociationOverride(name = "pk.customer", joinColumns = @JoinColumn(name = "CUSTOMER_ID"))
})
public class ProposeServiceCustomer implements Serializable {
	
	private static final long serialVersionUID = 4L;
	private ProposeServiceCustomerId pk = new ProposeServiceCustomerId();
	private LocalDateTime creation_date;
	
	 @EmbeddedId
	public ProposeServiceCustomerId getPk() {
		return pk;
	}
	public void setPk(ProposeServiceCustomerId pk) {
		this.pk = pk;
	}
	
	@Column(name="creation_date")
	public LocalDateTime getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(LocalDateTime creation_date) {
		this.creation_date = creation_date;
	}
	
	
	

}
