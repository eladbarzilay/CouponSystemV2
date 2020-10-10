package com.johnbryce.CouponSystemV2.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService extends ClientService{

	@Override
	public boolean login(String email, String password) {
		if (email.equals("admin@admin.com") && password.equals("admin")) {
			System.out.println("login okay");
			return true;
		}
		return false;
	}

}
