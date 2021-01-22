package com.derbala.helpus.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.derbala.helpus.Entities.RequestServiceCustomer;
import com.derbala.helpus.Entities.RequestServiceCustomerId;
import com.derbala.helpus.dao.IRequestServiceCustomerDao;

@Service("requestServiceCustomerService")
@Transactional
public class RequestServiceCustomerServiceImpl implements IRequestServiceCustomerService {

	@Autowired
	private IRequestServiceCustomerDao requestServiceCustomerDao;
	
	@Override
	public RequestServiceCustomer saveRequestServiceCustomer(RequestServiceCustomer requestServiceCustomer) {
		return requestServiceCustomerDao.save(requestServiceCustomer) ;
	}

	@Override
	public RequestServiceCustomer updateRequestServiceCustomer(RequestServiceCustomer requestServiceCustomer) {
		return requestServiceCustomerDao.save(requestServiceCustomer) ;
	}

	@Override
	public void deleteRequestServiceCustomer(RequestServiceCustomerId requestServiceCustomerId) {
		//requestServiceCustomerDao.deleteById(requestServiceCustomerId);
		
	}

	@Override
	public List<RequestServiceCustomer> getRequestServiceCustomerByCreationDate(LocalDateTime creationDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
