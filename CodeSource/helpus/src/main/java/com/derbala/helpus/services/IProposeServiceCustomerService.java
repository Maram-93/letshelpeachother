package com.derbala.helpus.services;

import java.time.LocalDateTime;
import java.util.List;

import com.derbala.helpus.Entities.ProposeServiceCustomer;

public interface IProposeServiceCustomerService {
	
	public ProposeServiceCustomer saveProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer);
	
	public ProposeServiceCustomer updateProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer);
	
	public void deleteProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer);
	
	public List <ProposeServiceCustomer> getProposeServiceCustomerByCreationDate (LocalDateTime creationDate);
	
	

}
