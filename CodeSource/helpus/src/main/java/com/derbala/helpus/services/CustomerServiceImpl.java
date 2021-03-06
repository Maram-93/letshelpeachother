package com.derbala.helpus.services;

import java.util.List;

import com.derbala.helpus.Entities.Customer;
import com.derbala.helpus.dao.ICustomerDao;

public class CustomerServiceImpl implements ICustomerService{
	
	private ICustomerDao customerDao;

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomerById (Integer id) {
		customerDao.deleteById(id);
		
	}

	@Override
	public List<Customer> getCustomersByCategory(String categoryCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
