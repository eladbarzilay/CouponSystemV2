package com.johnbryce.CouponSystemV2.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.johnbryce.CouponSystemV2.beans.Company;
import com.johnbryce.CouponSystemV2.beans.Customer;
import com.johnbryce.CouponSystemV2.service.AdminService;
import com.johnbryce.CouponSystemV2.service.CompanyService;
import com.johnbryce.CouponSystemV2.service.CustomerService;

@Component
public class AdminServiceTesting implements CommandLineRunner {

	@Autowired
	private AdminService adminService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private CustomerService customerService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("$$$$$ ADMIN SERVICE TESTING $$$$");

		adminService.login("admin@admin.com", "admin");

		System.out.println();
		System.out.println("###### add company #####");
		System.out.println();
		Company c1 = new Company();
		c1.setName("eladcorp");
		c1.setEmail("eladcorp@gmail.com");
		c1.setPassword("eladcorp");
		companyService.addCompany(c1);

		Company c2 = new Company();
		c2.setName("katiacorp");
		c2.setEmail("katiacorp@gmail.com");
		c2.setPassword("katiacorp");
		companyService.addCompany(c2);

		Company c3 = new Company();
		c3.setName("eladcorp");
		c3.setEmail("eladcorp@gmail.com");
		c3.setPassword("eladcorp1");
		try {

			companyService.addCompany(c3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println("###### update company #####");
		System.out.println();
		c1 = companyService.getOneCompany(1);
		// c1.setName("eladcorporatin");
		// c1.setId(65);
		c1.setPassword("eladcorp");
		try {

			companyService.updateCompany(c1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(companyService.getAllCompanies());

		System.out.println();
		System.out.println("###### delete company #####");
		companyService.deleteCompany(c1);
		System.out.println();
		System.out.println();
		System.out.println("###### get all companies #####");
		System.out.println();
		System.out.println(companyService.getAllCompanies());
		

		System.out.println();
		System.out.println("###### add customer #####");
		System.out.println();
		
		Customer cus1 = new Customer();
		cus1.setFirstname("elad");
		cus1.setLastname("barzilay");
		cus1.setEmail("eladbarzilay@gmail.com");
		cus1.setPassword("elad");
		customerService.addCustomer(cus1);;
		
		Customer cus2 = new Customer();
		cus2.setFirstname("katia");
		cus2.setLastname("kilimaher");
		cus2.setEmail("katiabarzilay@gmail.com");
		cus2.setPassword("katia");
		customerService.addCustomer(cus2);
		
		Customer cus3 = new Customer();
		cus3.setFirstname("elad");
		cus3.setLastname("barzilay");
		cus3.setEmail("eladbarzilay@gmail.com");
		cus3.setPassword("elad");
		try {
			customerService.addCustomer(cus3);;			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("###### update customer #####");
		System.out.println();
		cus2.setLastname("barzilay");
		try {
			customerService.updateCustomer(cus2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		cus2.setId(78);
		try {
			customerService.updateCustomer(cus2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(customerService.getAllCustomers());
		System.out.println();
		System.out.println("###### delete customer #####");
		System.out.println();
		customerService.deleteCustomer(cus1);
		System.out.println();
		System.out.println("###### get one customer #####");
		System.out.println();
		System.out.println(customerService.getOneCustomer(2));
		System.out.println();
		System.out.println("###### get all customers #####");
		System.out.println();
		System.out.println(customerService.getAllCustomers());
	}

	}

