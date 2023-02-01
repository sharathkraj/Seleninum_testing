package com.fb.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilities.commonutilities;

public class Login_page {
	
private static Login_page LoginInstance;
	
	private Login_page() {
		
	}
	
	public static Login_page getInstance() {
		
		if(LoginInstance == null) {
			
			LoginInstance= new Login_page();
		}
		
		return LoginInstance;
		
	}
	
	
	@FindBy(xpath = "//*[@id='user']")
	private static WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\'pass\']")
	private static WebElement PASSWORD;
	
	@FindBy(xpath = "//*[@id=\"right_col_top\"]/form/div/input")
	private static WebElement LOGIN_BUTTON;

	/*public WebElement getUSERNAME() {
		return USERNAME;
	}

	public  WebElement getPASSWORD() {
		return PASSWORD;
	}

	public  WebElement getLOGIN_BUTTON() {
		return LOGIN_BUTTON;
	}*/
	
	public void enterUSERNAME(String username) {
		commonutilities.getInstance().highlightElement(USERNAME);
		USERNAME.sendKeys(username);
	}

	public  void enterPASSWORD(String password) {
		commonutilities.getInstance().highlightElement(PASSWORD);
		PASSWORD.sendKeys(password);
	}

	public  void clickLOGIN_BUTTON() {
		commonutilities.getInstance().highlightElement(LOGIN_BUTTON);
		LOGIN_BUTTON.click();
	}
	
	

}
