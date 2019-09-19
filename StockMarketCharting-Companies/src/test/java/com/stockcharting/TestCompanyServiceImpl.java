package com.stockcharting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.stockcharting.entities.Company;
import com.stockcharting.repos.CompanyRepos;
import com.stockcharting.service.CompanyServiceImpl;

public class TestCompanyServiceImpl {


	private MockMvc mockMvc;
	
	
	
	@Autowired
	@Spy
	private CompanyRepos companyRepos;
	
    @InjectMocks
    private CompanyServiceImpl companyServiceImpl;
    
    @Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
         mockMvc = MockMvcBuilders.standaloneSetup(companyServiceImpl).build();
         
       //   userServiceImpl=  new UserServiceImpl();
    }
    
	@Test
	public void testSave() {
		String[] abc = {"a","b"};
		String[] xyz = {"x","z"};
		int[] x = {1,2,3,4};
		Company company = new Company("rohini", 13, 1234, "bran",abc,xyz, 567, "rtyh",x);
		Company c=companyServiceImpl.save(company);
		boolean ans=c instanceof Company; 
		assertEquals(ans,false);
	}

	

	@Test
	public void testDeleteById() {
	boolean res=companyServiceImpl.deleteById("15");
	assertEquals(res,true);
	}
}
