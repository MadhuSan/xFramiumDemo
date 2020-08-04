package com.ul.ls.cucumbersteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.xframium.device.factory.DeviceWebDriver;
import org.xframium.page.Page;
import org.xframium.page.PageManager;

import com.ul.ls.pages.Login;
import com.ul.ls.utility.WebControl;

import cucumber.api.java.en.Given;

public class CreateUser{
	
	//private Login loginPage;
	WebDriver driver;
	WebControl webControl;

	//Logger log = (Logger) LoggerFactory.getLogger(CreateUser.class);
	
	@Given("^User login to LS application$")
	public void User_login_to_LS_application(WebDriver driver) throws Throwable{
		try {
			DeviceWebDriver xfID = (DeviceWebDriver) driver;
			Login loginPage = (Login) PageManager.instance(xfID.getxFID()).createPage(Login.class, xfID);
			boolean isLoginSuccess =loginPage.login();
			if(isLoginSuccess)
				System.out.println("Login Successful");
				//log.info("Login Successful");
				
			else {
				//log.error("Login is not successful");
				System.out.println("Login is not successful");
				Assert.assertEquals("Login Successful", "Login is not successful");
			}
		}catch (Exception e) {
			e.getMessage();
			throw e;
		}
	}
}
