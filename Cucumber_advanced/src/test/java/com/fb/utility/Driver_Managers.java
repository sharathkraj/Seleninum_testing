package com.fb.utility;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import stepdefinitions.common_step_definitions;
import constants.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Managers {
	private static final Logger LOGGER = LogManager.getLogger(common_step_definitions.class);

	public static WebDriver driver = null;
	
	public static void launch_brower() {
		// TODO Auto-generated method stub
		
		try {
			
			switch (constants.Brower) {
			case "chrome":
				LOGGER.info("chrome");
//				System.setProperty(constants.CHROME_DRIVER, constants.Chrome_Driverlocation);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				LOGGER.info("firefox");
//				System.setProperty(constants.FIREFOX_DRIVER, constants.Firefox_Driverlocation);
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			default:
				
				LOGGER.info("default");
//				System.setProperty(constants.CHROME_DRIVER, constants.Chrome_Driverlocation);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				System.out.println("No brower found");
				break;
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	



}
