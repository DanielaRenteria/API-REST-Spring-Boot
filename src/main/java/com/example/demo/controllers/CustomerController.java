package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Customer;

public interface CustomerController {
	public List<Customer> getCustomers();
	public Optional<Customer> getCustomerById(Long id);	
	public Customer addCustomer(Customer customer);	
	public String deleteCustomer(Long id);	
	public String updateCustomer(Customer customerNew);	
	public String test();
	
}
