package com.johnbryce.CouponSystemV2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnbryce.CouponSystemV2.beans.Coupon;
import com.johnbryce.CouponSystemV2.repo.CouponRepository;

@Service
public class CouponService {

	@Autowired
	private CouponRepository couponRepository;

	public void addCoupon(Coupon coupon) {
		couponRepository.save(coupon);
	}

	public void updateCoupon(Coupon coupon) {
		couponRepository.saveAndFlush(coupon);
	}

	public void deleteCoupon(Coupon coupon) {
		couponRepository.delete(coupon);
	}

	public Coupon getOneCoupon(int id) {
		return couponRepository.getOne(id);
	}

	public List<Coupon> getAllCoupons() {
		return couponRepository.findAll();
	}
}
