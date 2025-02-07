package com.itlearn.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.itlearn.pageobject.BaseTest;
import com.itlearn.pageobject.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyLogin() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		String username ="Demo12";
		String password ="Test123456$";
		lp.loginToPortal(username, password);
		
		
	}

}
