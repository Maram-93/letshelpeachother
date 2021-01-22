package com.derbala.helpus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derbala.helpus.Entities.Category;

@Repository
public interface ICategoryDao extends JpaRepository <Category, Integer> {
	
	public List<Category> findAll();
	public List <Category> findByCategoryIgnoreCase();

}
