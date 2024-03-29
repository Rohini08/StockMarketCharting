package com.stockcharting.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.stockcharting.entities.Company;
import com.stockcharting.repos.CompanyRepos;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepos companyRepos;
	
	@Override
	public Company save(Company company) {
		// TODO Auto-generated method stub
		return companyRepos.save(company);
	}

	@Override
	public Iterable<Company> findAll() {
		// TODO Auto-generated method stub
		return companyRepos.findAll();
	}

	@Override
	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		companyRepos.deleteByname(id);
		
		return true;
	}

}
