package com.johnbryce.CouponSystemV2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnbryce.CouponSystemV2.beans.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
