package com.johnbryce.CouponSystemV2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnbryce.CouponSystemV2.beans.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer>{

}
