package com.testcases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class LoginPage_Test extends BaseClass {
	
	
	public LoginPage_Test() throws Exception {
		super();
		
	}
	
	@Test
	public void Method() {
		Initailization();
		
	}
	
	@AfterMethod
	public void cleanup() {
		driver.quit();
	}
	
	
	
	

}
