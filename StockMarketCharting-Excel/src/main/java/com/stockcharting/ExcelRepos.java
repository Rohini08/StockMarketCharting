package com.stockcharting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("excelRepos")
public interface ExcelRepos extends JpaRepository<Stock, Integer> {

}
