package com.derbala.helpus.services;

import java.util.List;

import com.derbala.helpus.Entities.Customer;

public interface ICustomerService {
	
	
    public Customer saveCustomer (Customer customer);
	
	public Customer updateCustomer (Customer customer);
	
	public void deleteCustomerById (Integer iId);
	
	public List<Customer> getCustomersByCategory(String categoryCode);

}
