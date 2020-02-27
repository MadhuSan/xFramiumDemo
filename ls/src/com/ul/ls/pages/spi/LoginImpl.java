package com.ul.ls.pages.spi;



import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.xframium.device.factory.DeviceWebDriver;
import org.xframium.page.AbstractPage;

import com.ul.ls.pages.Login;
import com.ul.ls.utility.WebControl;

public class LoginImpl extends AbstractPage implements Login {
	
	private DeviceWebDriver webDriver;
	private String xFID;
	//private static final Logger LOGGER = Logger.getLogger(LoginImpl.class);
	WebControl webControl;
	WebDriver driver;

	
	public void initializePage() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean login() throws Exception {
		boolean isLoginSuccess = false;
		String methodName = "login";
		webDriver = (DeviceWebDriver)getDriver();
		xFID = webDriver.getxFID();
		webControl = new WebControl(webDriver);
		loginSteps(methodName);
		isLoginSuccess = getElement(MyLearningLink).isVisible();
		return isLoginSuccess;
	}
	
	private void loginSteps(String methodName) {
		webDriver.manage().window().maximize();
		
		getElement(UNTxtbox).setValue("QAAccount", xFID);
		getElement(PWDTxtbox).setValue("goldengate88", xFID);
		getElement(LoginBtn).click();
	}

}
