package com.ul.keyWords;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.xframium.container.SuiteContainer;
import org.xframium.page.Page;
import org.xframium.page.data.PageData;
import org.xframium.page.element.Element;
import org.xframium.page.keyWord.step.AbstractKeyWordStep;
import org.xframium.reporting.ExecutionContextTest;

import com.google.common.base.Function;

public class KWSFileUpload extends AbstractKeyWordStep {
	
	@Override
	public boolean _executeStep( Page pageObject, WebDriver webDriver, Map<String, Object> contextMap, Map<String, PageData> dataMap, Map<String, Page> pageMap, SuiteContainer sC, ExecutionContextTest executionContext )
	{
		String locator = getParameterValue( getParameterList().get( 0 ), contextMap, dataMap, executionContext.getxFID() ) + "";
		String fileName = getParameterValue( getParameterList().get( 1 ), contextMap, dataMap, executionContext.getxFID() ) + "";
		WebElement element = webDriver.findElement(By.className(locator));
		element.sendKeys(System.getProperty("user.dir")+ "\\" + fileName);
		return true;
	}

}
