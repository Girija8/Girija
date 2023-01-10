package com.acti.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.acti.generics.BaseTest;
import com.acti.pom.ActitimeHomePage;
import com.acti.pom.ActitimeLoginPage;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}