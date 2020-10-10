package com.johnbryce.CouponSystemV2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.johnbryce.CouponSystemV2.beans.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

	
}
