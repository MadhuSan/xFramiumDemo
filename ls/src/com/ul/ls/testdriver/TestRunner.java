package com.ul.ls.testdriver;

import org.xframium.device.ng.TestContainer;
import org.xframium.driver.TestDriver;

import com.ul.ls.pages.Login;
import com.ul.ls.pages.spi.LoginImpl;

public class TestRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestDriver.main(new String[] {"../ls/src/com/ul/ls/resources/driverConfigTXT.txt"});
	}

}
