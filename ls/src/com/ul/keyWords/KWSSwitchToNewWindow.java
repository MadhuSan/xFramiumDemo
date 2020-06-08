package com.ul.keyWords;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.FluentWait;
import org.xframium.container.SuiteContainer;
import org.xframium.page.Page;
import org.xframium.page.data.PageData;
import org.xframium.page.element.Element;
import org.xframium.page.keyWord.step.AbstractKeyWordStep;
import org.xframium.reporting.ExecutionContextTest;

import com.google.common.base.Function;

public class KWSSwitchToNewWindow extends AbstractKeyWordStep {
	
	@Override
	public boolean _executeStep( Page pageObject, WebDriver webDriver, Map<String, Object> contextMap, Map<String, PageData> dataMap, Map<String, Page> pageMap, SuiteContainer sC, ExecutionContextTest executionContext )
	{
		Set<String> windows = webDriver.getWindowHandles();
		for (String winHandle : windows) {
			webDriver.switchTo().window(winHandle);
		}
			return true;
	}

}
