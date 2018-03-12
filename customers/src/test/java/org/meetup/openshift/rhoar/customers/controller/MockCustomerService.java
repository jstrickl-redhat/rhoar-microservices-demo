package org.meetup.openshift.rhoar.customers.controller;

import javax.enterprise.context.ApplicationScoped;

import org.meetup.openshift.rhoar.customers.model.Customer;
import org.meetup.openshift.rhoar.customers.service.ICustomerService;

@ApplicationScoped
public class MockCustomerService implements ICustomerService{

	@Override
	public Customer findById(Long id) {
		Customer c = null;
		if (id.equals(new Long(1))) {
			c = new Customer();
			c.setId(new Long(1));
			c.setUsername("mockusername");
			c.setName("Test User Mock");
			c.setSurname("Test Surname Mock");
			c.setAddress("Test Address Mock");
			c.setCity("Test City Mock");
			c.setCountry("Test Country Mock");
			c.setZipCode("MOCKZIP");
		}		
		return c;
	}

}
