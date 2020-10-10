package com.johnbryce.CouponSystemV2.clr;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.johnbryce.CouponSystemV2.beans.Category;
import com.johnbryce.CouponSystemV2.beans.Coupon;
import com.johnbryce.CouponSystemV2.service.CompanyService;
import com.johnbryce.CouponSystemV2.service.CouponService;

@Component
public class CompanyServiceTesting implements CommandLineRunner {

	@Autowired
	private CompanyService companyService;
	@Autowired
	private CouponService couponService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.println("$$$$$ COMPANY SERVICE TESTING $$$$");
		System.out.println();
		companyService.login("eladcorp@gmail.com", "corp");
		System.out.println();
		System.out.println("###### add coupon #####");
		System.out.println();

		Coupon c1 = new Coupon(1, 1, Category.FOOD, "burgers", "300 gram", Date.valueOf("2020-08-23"),
				Date.valueOf("2020-11-23"), 3, 35, "img");
		couponService.addCoupon(c1);

		Coupon c2 = new Coupon(2, 2, Category.VACATION, "grand hotel", "30% off", Date.valueOf("2020-04-13"),
				Date.valueOf("2020-07-13"), 5, 75.99, "img");
		couponService.addCoupon(c2);

		System.out.println();
		System.out.println("###### update coupon #####");
		System.out.println();
		c1.setAmount(23);
		couponService.updateCoupon(c1);
		System.out.println(couponService.getAllCoupons());
		System.out.println();
		System.out.println("###### delete coupon #####");
		System.out.println();
		couponService.deleteCoupon(c1);
		System.out.println();
		System.out.println("###### get one coupon #####");
		System.out.println();
		System.out.println(couponService.getOneCoupon(2));
		System.out.println();
		System.out.println("###### get all coupons #####");
		System.out.println();
		System.out.println(couponService.getAllCoupons());
	}

}
