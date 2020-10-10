package com.johnbryce.CouponSystemV2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnbryce.CouponSystemV2.repo.CompanyRepository;
import com.johnbryce.CouponSystemV2.repo.CouponRepository;
import com.johnbryce.CouponSystemV2.repo.CustomerRepository;

@Service
public abstract class ClientService {

	@Autowired
	protected CompanyRepository companyRepository;
	@Autowired
	protected CustomerRepository customerRepository;
	@Autowired
	protected CouponRepository couponRepository;
	
	public abstract boolean login(String email,String password);
}
