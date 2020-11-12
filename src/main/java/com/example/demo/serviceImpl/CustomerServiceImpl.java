package com.example.demo.serviceImpl;

import java.util.List;	
import java.util.Optional;	
import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
	
@Service	
public class CustomerServiceImpl implements CustomerService {		
	@Autowired
	CustomerRepository customerRepository;
	
	@Override		
	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();		
		}	
	@Override		
	public Optional<Customer> findCustomerById(Long id) {
		Optional<Customer> customer = customerRepository.findById(id);			
		return customer;		
		}	
	@Override		
	public Customer saveCustomer(Customer customerNew) {
		if (customerNew != null) {	
			return customerRepository.save(customerNew);
			}			
		return new Customer();		
		}	
	@Override		
	public String deleteCustomer(Long id) {
		if (customerRepository.findById(id).isPresent()) {
			customerRepository.deleteById(id);			
			return "Customer eliminado correctamente.";		
			}			
		return "Error! El customer no existe";	
		}	
	@Override		
	public String updateCustomer(Customer customerUpdated) {
		Long num = customerUpdated.getId();			
		if (customerRepository.findById(num).isPresent()) {
			Customer customerToUpdate = new Customer();		
			customerToUpdate.setId(customerUpdated.getId());			
			customerToUpdate.setName(customerUpdated.getName());			
			customerToUpdate.setSurname(customerUpdated.getSurname());			
			customerToUpdate.setBirtdate(customerUpdated.getBirtdate());		
			customerToUpdate.setPhone(customerUpdated.getPhone());			
			customerToUpdate.setCountry(customerUpdated.getCountry());			
			customerToUpdate.setCity(customerUpdated.getCity());			
			customerToUpdate.setDirection(customerUpdated.getDirection());			
			customerToUpdate.setPostCode(customerUpdated.getPostCode());			
			customerRepository.save(customerToUpdate);		
			return "Customer modificado";		
			}		
		return "Error al modificar el Customer";	
		}	
	
}