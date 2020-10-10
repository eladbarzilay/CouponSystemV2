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
import com.johnbryce.CouponSystemV2.beans.Coupon;
import com.johnbryce.CouponSystemV2.service.CouponService;

@RestController
@RequestMapping("coupons")
public class CouponController {

	@Autowired
	private CouponService couponservice;

	@PostMapping("add")
	public void addCoupon(@RequestBody Coupon coupon) {
		couponservice.addCoupon(coupon);
	}

	@PutMapping("update")
	public void updateCoupon(@RequestBody Coupon coupon) {
		couponservice.updateCoupon(coupon);
	}

	@DeleteMapping("delete")
	public void deleteCoupon(@RequestBody Coupon coupon) {
		couponservice.deleteCoupon(coupon);
	}

	@GetMapping("get-one-coupon")
	public Coupon getOneCoupon(@RequestParam(name = "id") int id) {
		return couponservice.getOneCoupon(id);
	}

	@GetMapping("get-all-coupons")
	public List<Coupon> getAllCoupons(@RequestBody Coupon coupon) {
		return couponservice.getAllCoupons();

	}
}
