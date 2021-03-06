package com.derbala.helpus.services;

import java.time.LocalDateTime;
import java.util.List;

import com.derbala.helpus.Entities.RequestServiceCustomer;
import com.derbala.helpus.Entities.RequestServiceCustomerId;

public interface IRequestServiceCustomerService {
	
	public RequestServiceCustomer saveRequestServiceCustomer(RequestServiceCustomer requestServiceCustomer);
	
	public RequestServiceCustomer updateRequestServiceCustomer(RequestServiceCustomer requestServiceCustomer);
	
	public void deleteRequestServiceCustomer(RequestServiceCustomerId requestServiceCustomerId);
	
	public List <RequestServiceCustomer> getRequestServiceCustomerByCreationDate (LocalDateTime creationDate);
	

}
