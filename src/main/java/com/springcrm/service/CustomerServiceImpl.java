package com.springcrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrm.dao.CustomerDao;
import com.springcrm.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer saveCustomer(Customer customer) {
		return this.customerDao.saveCustomer(customer);
	}

	@Override
	public Customer findCustomerById(Integer customerId) {
		return this.customerDao.getCustomerById(customerId);
	}

	@Override
	public List<Customer> findAllCustomers() {
		return this.customerDao.getAllCustomers();
	}

	@Override
	public Customer deleteCustomer(Integer customerId) {
		return this.customerDao.deleteCustomer(customerId);
	}

}
