package com.johnbryce.CouponSystemV2.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Coupons")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int companyID;
	private Category category;
	private String title;
	private String description;
	private Date start_date;
	private Date end_date;
	private int amount;
	private double price;
	private String image;
}
