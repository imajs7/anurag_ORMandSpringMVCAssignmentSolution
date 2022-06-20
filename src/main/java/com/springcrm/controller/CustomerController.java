package com.springcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrm.model.Customer;
import com.springcrm.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/home")
	public String getHome() {
		return "redirect:/";
	}
	
	@RequestMapping("/")
	public String getAllCustomers(Model model) {
		List<Customer> allCustomers = customerService.findAllCustomers();
		model.addAttribute("customers", allCustomers);
		System.out.println(allCustomers.toString());
		return "customer-list";
	}
	
	@RequestMapping("/addcustomer")
	public String addNewCustomer(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		return "add-customer";
	}
	
	@RequestMapping("/update/{id}")
	public String editCustomer(@PathVariable("id") int customerId, Model model) {
		Customer customer = customerService.findCustomerById(customerId);
		model.addAttribute("customer", customer);
		return "add-customer";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") int customerId) {
		customerService.deleteCustomer(customerId);
		return "redirect:/";
	}
	
}
