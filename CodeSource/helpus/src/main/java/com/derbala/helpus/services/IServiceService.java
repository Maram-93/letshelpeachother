package com.derbala.helpus.services;

import java.util.List;

import com.derbala.helpus.Entities.Service;

public interface IServiceService {

	public Service saveService (Service service);
	
	public Service updateService (Service service);
	
	public List<Service> getServicesByCategory(String categoryCode);

	public void deleteServiceById(Integer id);
	
}
