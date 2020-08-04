package com.ul.ls.pages;

import org.xframium.device.ng.TestContainer;
import org.xframium.page.Page;
import org.xframium.page.Page.ElementDefinition;

public interface Login extends Page {
	
	@ElementDefinition
	public String UNTxtbox = "UNTxtbox";
	
	@ElementDefinition
	public String PWDTxtbox = "PWDTxtbox";
	
	@ElementDefinition
	public String LoginBtn = "LoginBtn";
	
	@ElementDefinition
	public String MyLearningLink = "MyLearningLink";
	
	public boolean login() throws Exception;

	void initializePage();


}