package com.derbala.helpus.services;

import java.time.LocalDateTime;
import java.util.List;

import com.derbala.helpus.Entities.ProposeServiceCustomer;
import com.derbala.helpus.dao.IProposeServiceCustomerDao;

public class ProposeServiceCustomerServiceImp implements IProposeServiceCustomerService{
	
	private IProposeServiceCustomerDao proposeServiceCustomerServiceDao;
	
	@Override
	public ProposeServiceCustomer saveProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer) {
		return proposeServiceCustomerServiceDao.save(proposeServiceCustomer);
	}

	@Override
	public ProposeServiceCustomer updateProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer) {
		return proposeServiceCustomerServiceDao.save(proposeServiceCustomer);
	}

	@Override
	public void deleteProposeServiceCustomer(ProposeServiceCustomer proposeServiceCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProposeServiceCustomer> getProposeServiceCustomerByCreationDate(LocalDateTime creationDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
