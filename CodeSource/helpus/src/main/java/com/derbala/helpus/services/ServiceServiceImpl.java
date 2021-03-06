package com.derbala.helpus.services;

import java.util.List;

import com.derbala.helpus.Entities.Service;
import com.derbala.helpus.dao.IServiceDao;

public class ServiceServiceImpl implements IServiceService {
	 
	private IServiceDao serviceDao;
	
	@Override
	public Service saveService(Service service) {
		return serviceDao.save(service);
	}

	@Override
	public Service updateService(Service service) {
		 return serviceDao.save(service);
	}

	@Override
	public void deleteServiceById (Integer id) {
		serviceDao.deleteById(id);
		
	}

	@Override
	public List<Service> getServicesByCategory(String categoryCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
