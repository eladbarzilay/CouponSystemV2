package com.johnbryce.CouponSystemV2.beans;

import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "Categories")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public enum Category {

	FOOD, 
	ELECTRICITY ,
	RESTURANT, 
	VACATION ,
}
