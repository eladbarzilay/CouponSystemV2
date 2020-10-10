package com.johnbryce.CouponSystemV2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.johnbryce.CouponSystemV2.beans.Company;
import com.johnbryce.CouponSystemV2.exeptions.NotValidExeption;
import com.johnbryce.CouponSystemV2.exeptions.NotValidUpdate;
import com.johnbryce.CouponSystemV2.repo.CompanyRepository;

@Service
public class CompanyService extends ClientService{

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}


	public void addCompany(Company company) throws NotValidExeption {
		List<Company> companies = companyRepository.findAll();
		for (Company comp : companies) {
			if (comp.getName().equals(company.getName()) || comp.getEmail().equals(company.getEmail())) {
				throw new NotValidExeption("****company already exist****");
			}
		}
		companyRepository.save(company);
		System.out.println("company added !");
	}
		
	

	public void updateCompany(Company company) throws NotValidUpdate {
		List<Company> companies = companyRepository.findAll();
		for (Company comp : companies) {
			if (comp.getId() == company.getId() && comp.getName().equals(company.getName())) {
				companyRepository.saveAndFlush(company);
				System.out.println("company updated !");
				break;
			}
			throw new NotValidUpdate("****id or company name cant be changed****");

		}
		
	}

	public void deleteCompany(Company company) {
		companyRepository.delete(company);
	}

	public Company getOneCompany(int id) {
		return companyRepository.getOne(id);
	}

	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}




}
