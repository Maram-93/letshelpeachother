package com.derbala.helpus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derbala.helpus.Entities.ProposeServiceCustomer;

@Repository
public interface IProposeServiceCustomerDao extends JpaRepository <ProposeServiceCustomer, Integer>  {
	
	public List<ProposeServiceCustomer> findAll();
	//public List <ProposeServiceCustomer> findByCategoryIgnoreCase();

}
