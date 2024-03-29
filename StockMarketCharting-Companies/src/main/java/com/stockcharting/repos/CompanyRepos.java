package com.stockcharting.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stockcharting.entities.Company;

@Repository("companyRepos")
public interface CompanyRepos extends CrudRepository<Company, Integer>{
	
@Modifying
@Transactional
void deleteByname(String name);
	
	
}
