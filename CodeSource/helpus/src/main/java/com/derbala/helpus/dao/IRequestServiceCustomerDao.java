package com.derbala.helpus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.derbala.helpus.Entities.RequestServiceCustomer;

@Repository
public interface IRequestServiceCustomerDao extends JpaRepository <RequestServiceCustomer, Integer>  {
	
	/**@Query ("ALTER Table"
			+ "INNER join service.category_code category cat"
			+ "Where cat.code =: code")*/
	//public void deleteByID();
	public List<RequestServiceCustomer> findAll();
	//public List <RequestServiceCustomer> findByCategoryIgnoreCase();

}
