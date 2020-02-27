package com.ul.ls.utility;



import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.testng.log4testng.Logger;
import org.xframium.device.factory.DeviceWebDriver;

public class WebControl {
	
	protected DeviceWebDriver webDriver;
	protected WebDriver driver;
	Logger log = (Logger) LoggerFactory.getLogger(WebControl.class);
	
	public WebControl(WebDriver driver) {
		this.driver = driver;
		this.webDriver = (DeviceWebDriver)driver;
	}
	
}
