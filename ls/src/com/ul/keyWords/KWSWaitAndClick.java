package com.ul.keyWords;

import java.time.Duration;
import java.util.Map;

import javax.lang.model.util.Elements;

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

public class KWSWaitAndClick extends AbstractKeyWordStep {
	
	public KWSWaitAndClick()
	{
		kwName = "WaitAndClick";
		kwDescription = "Adds fluent wait to script and clicks on the center of the named element";
		kwHelp = "https://www.xframium.org/keyword.html#kw-click";
		category = "Interaction";
		featureId = 13;
	}
	/* (non-Javadoc)
	 * @see com.perfectoMobile.page.keyWord.step.AbstractKeyWordStep#_executeStep(com.perfectoMobile.page.Page, org.openqa.selenium.WebDriver, java.util.Map, java.util.Map)
	 */
	@Override
	public boolean _executeStep( Page pageObject, WebDriver webDriver, Map<String, Object> contextMap, Map<String, PageData> dataMap, Map<String, Page> pageMap, SuiteContainer sC, ExecutionContextTest executionContext )
	{
		Element element = getElement( pageObject, contextMap, webDriver, dataMap, executionContext );
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(webDriver);
			 wait.pollingEvery(Duration.ofSeconds(2));
			 wait.withTimeout(Duration.ofMinutes(10));
			 wait.ignoring(NoSuchElementException.class)
			 	 .ignoring(ElementClickInterceptedException.class)
			 	 .ignoring(StaleElementReferenceException.class)
			 	 .ignoring(WebDriverException.class)
			 	 .ignoring(ElementNotInteractableException.class);
			 
			 Function<WebDriver, Element> elementClick  = new Function<WebDriver, Element>()
			 {
			 public Element apply(WebDriver arg0) {
			 {
			 element.click();
			 }
			 return (Element) element;
			 }
			 };
			 
			 wait.until(elementClick);
			return true;
	}
}
