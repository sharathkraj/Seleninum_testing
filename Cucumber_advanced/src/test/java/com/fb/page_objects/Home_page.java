  package com.fb.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Home_page {
	public static Home_page HomeInstance;
		
		private Home_page() {
			
		}
		
		public static Home_page getInstance() {
			
			if(HomeInstance == null) {
				
				HomeInstance= new Home_page();
			}
			
			return HomeInstance;
			
		}
		
		@FindBy(xpath = "//*[@id=\"user_bar\"]/ul/li[2]/a")
		private static WebElement NEWFORM_WIZARD;
		
		@FindBy(xpath = "//*[@id=\"center_col\"]/form/div/input")
		private static WebElement START_WIZARD;
		
		// step-0
		@FindBy(xpath = "//*[@id=\'formname\']")
		private static WebElement NAME;
		
		@FindBy(id = "format")
		public static WebElement DROP_DOWN;
		
		
		@FindBy(xpath = "//*[@id=\'Submit\']")
		private static WebElement SUB1;
		
		// step 1
		
		// click
		
		
		// step_2 and3
		@FindBy(xpath = "//*[@id=\'eadd\']")
		private static WebElement ADDRESS;	
		
		
		
		@FindBy (xpath = "//*[@id=\"center_col\"]/form/div[3]/input")
		private static WebElement E_SUB;
		
		@FindBy (xpath =  "//*[@id='subjectvalue']")
		private static WebElement SUB_MSG;
			

		@FindBy(id = "subjectvalue" )
		private static WebElement SUB_VALl;
			
			
		@FindBy(id = "option[]")
		private static WebElement SUBJECT_1;
			
			
		// step_4
			
		@FindBy(xpath = "//*[@id=\"center_col\"]/form/div[2]/label" )
		private static WebElement SEND_CONFIRM;

			
		@FindBy(id = "autosub" )
		private static WebElement EMA_SUB;
			
		@FindBy(xpath = "//*[@id=\"autotext\"]")
		private static WebElement SUB_CON;
			

			
			// Step - 5
				
		@FindBy(xpath = "//*[@id=\"numquestions\"]" )
		private static WebElement QUS;
			
				
		@FindBy(xpath = "//*[@id=\"question[]\"]" )
		private static WebElement QUS_1;
			
			
			
		// step_7
			
		@FindBy(xpath = "//*[@name='fontcolor']")
		private static WebElement CLEAR;
			
		@FindBy(xpath = "//*[@name='fontcolor']")
		private static WebElement COLOR;
			
		@FindBy(xpath = "//*[@id=\"bold\"]")
		private static WebElement BOLD;

			
		// step - 8
			
		@FindBy(xpath = "//*[@id=\"bordercolor\"]")
		private static WebElement CLEAR1;
			
		@FindBy(xpath = "//*[@id=\"bordercolor\"]")
		private static WebElement COLOR1;
			
		@FindBy(xpath = "//*[@id=\"linecolor\"]")
		private static WebElement CLEAR2;
			
		@FindBy(xpath = "//*[@id=\"linecolor\"]")
		private static WebElement COLOR2;

			
		// logout

		@FindBy(xpath = "//*[@id=\'user_bar\']/ul/li[1]/a" )
		private static WebElement LOG_OUT;


		
	/*	public  WebElement getNEWFORM_WIZARD() {
			return NEWFORM_WIZARD;
		}


		public  WebElement getSTART_WIZARD() {
			return START_WIZARD;
		}


		public  WebElement getNAME() {
			return NAME;
		}


		


		public  WebElement getSUB1() {
			return SUB1;
		}


		public  WebElement getADDRESS() {
			return ADDRESS;
		}


		public  WebElement getE_SUB() {
			return E_SUB;
		}


		public  WebElement getSUB_MSG() {
			return SUB_MSG;
		}


		public  WebElement getSUB_VALl() {
			return SUB_VALl;
		}


		public  WebElement getSUBJECT_1() {
			return SUBJECT_1;
		}


		public  WebElement getSEND_CONFIRM() {
			return SEND_CONFIRM;
		}


		public  WebElement getEMA_SUB() {
			return EMA_SUB;
		}


		public  WebElement getSUB_CON() {
			return SUB_CON;
		}


		public  WebElement getQUS() {
			return QUS;
		}


		public  WebElement getQUS_1() {
			return QUS_1;
		}


		public  WebElement getCLEAR() {
			return CLEAR;
		}


		public  WebElement getCOLOR() {
			return COLOR;
		}


		public  WebElement getBOLD() {
			return BOLD;
		}


		public  WebElement getCLEAR1() {
			return CLEAR1;
		}


		public  WebElement getCOLOR1() {
			return COLOR1;
		}


		public  WebElement getCLEAR2() {
			return CLEAR2;
		}


		public  WebElement getCOLOR2() {
			return COLOR2;
		}


		public  WebElement getLOG_OUT() {
			return LOG_OUT;
		}*/
		
		public  void getNEWFORM_WIZARD() {
			 NEWFORM_WIZARD.click();
		}


		public  void getSTART_WIZARD() {
			 START_WIZARD.click();
		}


		public  void getNAME(String name) {
			 NAME.sendKeys(name);;
		}


		public  void getDROP_DOWN() {
			
			Select format = new Select(DROP_DOWN);
			format.selectByIndex(1);
			
		}


		public  void getSUB1() {
			SUB1.click();
		}


		public  void getADDRESS(String addr ) {
			
			Select select = new Select(ADDRESS);
					select.selectByIndex(1);
		}


		public  void getE_SUB() {
			 E_SUB.click();;
		}


		public  void getSUB_MSG(String msg) {
			SUB_MSG.sendKeys(msg);;
		}


		public  void getSUB_VALl(String val) {
			SUB_VALl.sendKeys(val);;
		}


		public  void getSUBJECT_1(String sub1) {
			SUBJECT_1.sendKeys(sub1);;
		}


		public  void getSEND_CONFIRM() {
			SEND_CONFIRM.click();
		}


		public  void getEMA_SUB(String emasub) {
			EMA_SUB.sendKeys(emasub);;
		}


		public  void getSUB_CON(String sub) {
			SUB_CON.sendKeys(sub);;
		}


		public  void getQUS(String qus) {
			QUS.sendKeys(qus);;
		}


		public  void getQUS_1(String qus1) {
			QUS_1.sendKeys(qus1);;
		}


		public  void getCLEAR() {
			CLEAR.clear();
		}


		public  void getCOLOR(String color) {
			COLOR.sendKeys(color);;
		}


		public  void getBOLD() {
			BOLD.click();
		}


		public  void getCLEAR1() {
			CLEAR1.clear();
		}


		public  void getCOLOR1(String color1) {
			COLOR1.sendKeys(color1);;
		}


		public  void getCLEAR2() {
			CLEAR2.clear();
		}


		public  void getCOLOR2(String color2) {
			COLOR2.sendKeys(color2);;
		}


		public  void getLOG_OUT() {
			LOG_OUT.click();
		}


	}

