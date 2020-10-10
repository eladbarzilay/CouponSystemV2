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
import com.johnbryce.CouponSystemV2.beans.Company;
import com.johnbryce.CouponSystemV2.exeptions.NotValidExeption;
import com.johnbryce.CouponSystemV2.service.CompanyService;

@RestController
@RequestMapping("companies")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("add")
	public void addCompany(@RequestBody Company company) {
		try {
			companyService.addCompany(company);
		} catch (NotValidExeption e) {
			System.out.println(e.getMessage());
		}
	}

	@PutMapping("update")
	public void updateCompany(@RequestBody Company company) {
		try {

			companyService.updateCompany(company);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	@DeleteMapping("delete")
	public void deleteCompany(@RequestBody Company company) {
		companyService.deleteCompany(company);
	}

	@GetMapping("get-one-Company")
	public Company getOneCompany(@RequestParam(name = "id") int id) {
		return companyService.getOneCompany(id);
	}

	@GetMapping("get-all-Companies")
	public List<Company> getAllCompanies(@RequestBody Company company) {
		return companyService.getAllCompanies();

	}
}
