//package com.johnbryce.CouponSystemV2.clr;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.johnbryce.CouponSystemV2.beans.Customer;
//import com.johnbryce.CouponSystemV2.service.CustomerService;
//
//@Component
//public class CustomerServiceTesting implements CommandLineRunner{
//	@Autowired
//	private CustomerService customerService;
//	
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println();
//		System.out.println("$$$$$ CUSTOMER SERVICE TESTING $$$$");
//		
//		System.out.println();
//		System.out.println("###### add customer #####");
//		System.out.println();
//		
//		Customer c1 = new Customer();
//		c1.setFirstname("elad");
//		c1.setLastname("barzilay");
//		c1.setEmail("eladbarzilay@gmail.com");
//		c1.setPassword("elad");
//		customerService.addCustomer(c1);;
//		
//		Customer c2 = new Customer();
//		c2.setFirstname("katia");
//		c2.setLastname("kilimaher");
//		c2.setEmail("katiabarzilay@gmail.com");
//		c2.setPassword("katia");
//		customerService.addCustomer(c2);
//		
//		Customer c3 = new Customer();
//		c3.setFirstname("elad");
//		c3.setLastname("barzilay");
//		c3.setEmail("eladbarzilay@gmail.com");
//		c3.setPassword("elad");
//		try {
//			customerService.addCustomer(c3);;			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println();
//		System.out.println("###### update customer #####");
//		System.out.println();
//		c2.setLastname("barzilay");
//		try {
//			customerService.updateCustomer(c2);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		c2.setId(78);
//		try {
//			customerService.updateCustomer(c2);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		
//		
//		System.out.println(customerService.getAllCustomers());
//		System.out.println();
//		System.out.println("###### delete customer #####");
//		System.out.println();
//		customerService.deleteCustomer(c1);
//		System.out.println();
//		System.out.println("###### get one customer #####");
//		System.out.println();
//		System.out.println(customerService.getOneCustomer(2));
//		System.out.println();
//		System.out.println("###### get all customers #####");
//		System.out.println();
//		System.out.println(customerService.getAllCustomers());
//	}
//
//}
