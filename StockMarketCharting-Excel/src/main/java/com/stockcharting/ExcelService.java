package com.stockcharting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface ExcelService {

	void save(Stock stock);


}
