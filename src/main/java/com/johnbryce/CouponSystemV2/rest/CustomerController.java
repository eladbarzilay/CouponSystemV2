package com.johnbryce.CouponSystemV2.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.johnbryce.CouponSystemV2.beans.Customer;
import com.johnbryce.CouponSystemV2.exeptions.NotValidExeption;
import com.johnbryce.CouponSystemV2.service.CustomerService;

@RestController
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("add")
	public void addCustomer(@RequestBody Customer customer) {
		try {
			customerService.addCustomer(customer);
		} catch (NotValidExeption e) {
			System.out.println(e.getMessage());
		}
	}

	@PutMapping("update")
	public void updateCustomer(@RequestBody Customer customer) {
		try {
			customerService.updateCustomer(customer);
		} catch (NotValidExeption e) {
			System.out.println(e.getMessage());
		}
	}

	@DeleteMapping("delete")
	public void deleteCustomer(@RequestBody Customer customer) {
		customerService.deleteCustomer(customer);
	}

	@GetMapping("get-one-customer")
	public Customer getOneCustomer(@RequestParam(name = "id") int id) {
		return customerService.getOneCustomer(id);
	}

	@GetMapping("get-all-customers")
	public List<Customer> getAllCustomers(@RequestBody Customer customer) {
		return customerService.getAllCustomers();

	}

}
