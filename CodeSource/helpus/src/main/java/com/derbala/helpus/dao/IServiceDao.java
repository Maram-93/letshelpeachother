package com.derbala.helpus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.derbala.helpus.Entities.*;


@Repository
public interface IServiceDao extends JpaRepository <Service, Integer> {

	public List<Service> findAll();
	public List <Service> findByCodeIgnoreCase();
	
	@Query ("Select s from service s"
			+ "INNER join service.category_code category cat"
			+ "Where cat.code =: code")
	public List <Service> findByCategoryCodeIgnoreCase(@Param("code") String codeCategory);
	
	  
}
