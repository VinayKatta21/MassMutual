package com.mm.utils;

public interface IConstants {
	
	String projPath = System.getProperty("user.dir");
	
	String chromeDriverPath = projPath+"/src/main/resources/drivers/mac/chromedriver";
	
	String geckoDriverPath = projPath+"/src/main/resources/drivers/mac/geckodriver";

	String envPropsPath = projPath+"/src/test/resources/env.properties";
}
