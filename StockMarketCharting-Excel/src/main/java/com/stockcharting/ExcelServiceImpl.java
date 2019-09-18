package com.stockcharting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("excelService")

public class ExcelServiceImpl implements ExcelService{

	
	@Autowired
	private ExcelRepos excelRepos;
	@Override
	public void save(Stock stock) {
		// TODO Auto-generated method stub
		
		System.out.println("in service");
		System.out.println(stock);
		excelRepos.save(stock);
		
		
	}

}
