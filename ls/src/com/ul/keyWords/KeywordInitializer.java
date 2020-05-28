package com.ul.keyWords;

import java.util.Map;
import java.util.Properties;

import org.xframium.Initializable;
import org.xframium.page.keyWord.step.KeyWordStepFactory;

public class KeywordInitializer implements Initializable {
	
	public void initialize(String propertyPrefix, Map<String, String> propertyMap  ) {
		KeyWordStepFactory.instance().addKeyWord( "waitAndClick", KWSWaitAndClick.class );
		
	}


}
