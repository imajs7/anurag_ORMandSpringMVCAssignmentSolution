package com.springcrm.service;

import java.util.List;

import com.springcrm.model.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public Customer findCustomerById(Integer customerId);
	public List<Customer> findAllCustomers();
	public Customer deleteCustomer(Integer customerId);

}
