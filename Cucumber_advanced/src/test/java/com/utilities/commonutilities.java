package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fb.page_objects.Home_page;
import com.fb.page_objects.Login_page;
import com.fb.utility.Driver_Managers;

import constants.constants;
import stepdefinitions.common_step_definitions;

public class commonutilities {
	
	private static commonutilities commonutilitiesInstance = null;
	
	private commonutilities() {
		
	}
	
	public static commonutilities getInstance()
	{
		if(commonutilitiesInstance==null) {
			commonutilitiesInstance=new commonutilities();	
		}
		return commonutilitiesInstance;
	}
	
	 
public  void loadproperties(){
		
		
		Properties properties = new Properties();
		try {
		
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		constants.APP_URL = properties.getProperty("APP_URL");
		constants.Brower =  properties.getProperty("Brower");
		constants.Username = properties.getProperty("Username");
		constants.Password = properties.getProperty("Password");
		constants.Chrome_Driverlocation =  properties.getProperty("Chrome_Driverlocation");
		constants.Firefox_Driverlocation= properties.getProperty("Firefox_Driverlocation");
	}

	  public void initWebElements() {
		  PageFactory.initElements(Driver_Managers.getDriver(),Login_page.getInstance());
		  PageFactory.initElements(Driver_Managers.getDriver(),Home_page.getInstance());
		  
	  }
	  
	  public void takeScreeshot( ) {
		  
		  File screenshot = ((TakesScreenshot) Driver_Managers.getDriver()).getScreenshotAs(OutputType.FILE);
		  try {
			  FileUtils.copyFile(screenshot, new File(common_step_definitions.getScenarioName()+".png"));
//			  FileUtils.copyFile(screenshot, new File("screenshot.png"));
		  } catch (IOException e) {
			  System.out.println(e.getMessage());
		  }
	  }
	  
	  
	  public void highlightElement(WebElement element) {
		  JavascriptExecutor executor=(JavascriptExecutor) Driver_Managers.getDriver();
		  executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue';", element);
	  }


}
