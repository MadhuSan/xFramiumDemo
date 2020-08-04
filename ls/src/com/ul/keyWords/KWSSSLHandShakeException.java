package com.ul.keyWords;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.xframium.container.SuiteContainer;
import org.xframium.page.Page;
import org.xframium.page.data.PageData;
import org.xframium.page.keyWord.step.AbstractKeyWordStep;
import org.xframium.reporting.ExecutionContextTest;


import io.restassured.RestAssured;

public class KWSSSLHandShakeException extends AbstractKeyWordStep {	
	
	@Override
		public boolean _executeStep( Page pageObject, WebDriver webDriver, Map<String, Object> contextMap, Map<String, PageData> dataMap, Map<String, Page> pageMap, SuiteContainer sC, ExecutionContextTest executionContext )
		{
			try {
			RestAssured.useRelaxedHTTPSValidation();
			return true;
			}catch(Exception e) {
				throw e;
			}
		}

	}
