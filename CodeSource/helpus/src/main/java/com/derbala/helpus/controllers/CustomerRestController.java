package com.derbala.helpus.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derbala.helpus.dto.CustomerDTO;
import com.derbala.helpus.services.CustomerServiceImpl;

@RestController
@RequestMapping("/rest/customer/api")
public class CustomerRestController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(CustomerRestController.class);
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	/**
	 * Created new Customer
	 */
	@PostMapping("/addCustomer")
	public ResponseEntity <CustomerDTO> createNewCustomer (@RequestBody CustomerDTO newCustomer){
		
		customerService.saveCustomer(newCustomer);
		
		
	}
	
	

}
