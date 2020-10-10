package com.johnbryce.CouponSystemV2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;

import com.johnbryce.CouponSystemV2.beans.Customer;
import com.johnbryce.CouponSystemV2.exeptions.NotValidExeption;
import com.johnbryce.CouponSystemV2.repo.CustomerRepository;

@Service
public class CustomerService extends ClientService{

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addCustomer(Customer customer) throws NotValidExeption {
		List<Customer> customers = customerRepository.findAll();
		for (Customer cust : customers) {
			if (cust.getEmail().equals(customer.getEmail())) {
				throw new NotValidExeption("****customer already exist****");
			}
		}
		customerRepository.save(customer);
		System.out.println("customer added !");
	}

	public void updateCustomer(Customer customer) throws NotValidExeption {
		int x =0;
		List<Customer> customers = customerRepository.findAll();
		for (Customer cust : customers) {
			if (cust.getId() == customer.getId()) {
				customerRepository.saveAndFlush(customer);
				 System.out.println("customer updated !");	
				 x=1;
				 break;
			}				
		}
		if (x!=1) {			
			throw new NotValidExeption("****customer id can't be changed****");					
		}
	}

	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}

	public Customer getOneCustomer(int id) {
		return customerRepository.getOne(id);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}


}
