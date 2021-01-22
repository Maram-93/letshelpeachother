package com.derbala.helpus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derbala.helpus.Entities.Customer;

@Repository
public interface ICustomerDao extends JpaRepository <Customer, Integer> {
	
	public List<Customer> findAll();
	public List <Customer> findByLoginIgnoreCase();

}
