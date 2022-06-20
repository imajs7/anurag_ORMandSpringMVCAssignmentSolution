package com.springcrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springcrm.model.Customer;

@Repository
public class CustomerDao {
	
	@Autowired
	private HibernateTemplate hTemplate;
	
	public List<Customer> getAllCustomers(){
		return this.hTemplate.loadAll(Customer.class);
	}
	
	public Customer getCustomerById(int customerId) {
		return this.hTemplate.get(Customer.class, customerId);
	}
	
	@Transactional
	public Customer saveCustomer(Customer customer) {
		this.hTemplate.saveOrUpdate(customer);
		return customer;
	}
	
	@Transactional
	public Customer deleteCustomer(int customerId) {
		Customer customer = this.hTemplate.load(Customer.class, customerId);
		this.hTemplate.delete(customer);
		return customer;
	}

}
