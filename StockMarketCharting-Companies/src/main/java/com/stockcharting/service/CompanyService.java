package com.stockcharting.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockcharting.entities.Company;

public interface CompanyService {

	Company save(Company company);

	Iterable<Company> findAll();

	void deleteById(String id);

}
