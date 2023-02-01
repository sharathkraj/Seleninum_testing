package stepdefinitions;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import com.fb.page_objects.Home_page;
import com.fb.page_objects.Login_page;
import com.fb.utility.Driver_Managers;
import com.utilities.commonutilities;

import constants.constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Myform_creation {
		
		static final Logger LOGGER = Logger.getLogger(Myform_creation.class);
		
		@Given("the users is logged in sucessfully in mycontactform home page")
		public void the_users_is_logged_in_sucessfully_in_mycontactform_home_page() {
			
			
			try {
			Login_page.getInstance();

			Driver_Managers.getDriver().get(constants.APP_URL);
			PropertyConfigurator.configure("log4j.properties");
			LOGGER.info("Entering to the login page");	
			Login_page.getInstance().enterUSERNAME(constants.Username);
			Login_page.getInstance().enterPASSWORD(constants.Password);
			Login_page.getInstance().clickLOGIN_BUTTON();	
			LOGGER.info("login sucessfully");
		}
			catch (Exception e) {
		     LOGGER.error(e);
		     commonutilities.getInstance().takeScreeshot();
			}
		}
		
		@When("the user click the new form in homepage")
		public void the_user_click_the_new_form_in_homepage() {
			
			try {
		  	
					LOGGER.info("click the Newform wizard");
				    Home_page.getInstance().getNEWFORM_WIZARD();
					
					LOGGER.info("start the Newform wizard");
					Home_page.getInstance().getSTART_WIZARD();
					
					//step -1
					LOGGER.info("start the step- 1");
					Home_page.getInstance().getNAME("Sharath1233365448453542767564544567");
					Home_page.getInstance().getDROP_DOWN();
					Home_page.getInstance().getSUB1();
		}
			catch (Exception e) {
			LOGGER.error(e);
			commonutilities.getInstance().takeScreeshot();
			}
			}
		
		@When("the use enter the new form wizard")
		public void the_use_enter_the_new_form_wizard() {
			
			try {
				
			
			LOGGER.info("start the step- 2");
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getADDRESS("krsharath004@gmail.com");
			Home_page.getInstance().getSUB1();
			
			LOGGER.info("start the step- 3");
			Home_page.getInstance().getE_SUB();
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUB_MSG("1");
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUBJECT_1("Hello!! all");
			Home_page.getInstance().getSUB1();
			
			
			// step_4
			
			LOGGER.info("start the step- 4");
			Home_page.getInstance().getSEND_CONFIRM();
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getEMA_SUB("test!! all");
			Home_page.getInstance().getSUB_CON("test!!");
			Home_page.getInstance().getSUB1();
			
			
			// step_5
			
			LOGGER.info("start the step- 5");
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getQUS("1");
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getQUS_1("Question1");
			Home_page.getInstance().getSUB1();
			
			
			// step_6
			
			LOGGER.info("start the step- 6");
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUB1();
			Home_page.getInstance().getSUB1();
			}
			
			catch (Exception e) {
				LOGGER.error(e);	
				commonutilities.getInstance().takeScreeshot();
				}
		}
		
		@When("enter the form details")
		public void enter_the_form_details() {
			// step_7
			
			try {
						PropertyConfigurator.configure("log4j2.properties");
								LOGGER.info("start the step- 7");
								Home_page.getInstance().getCLEAR();
								Home_page.getInstance().getCOLOR("#382b1b");		
								Home_page.getInstance().getBOLD();
								Home_page.getInstance().getSUB1();
							
								
								
								// step_8
								
								LOGGER.info("start the step- 8");
								Home_page.getInstance().getCLEAR1();
								Home_page.getInstance().getCOLOR1("#db1818");
								Home_page.getInstance().getCLEAR2();
								Home_page.getInstance().getCOLOR2("#db1818");
								Home_page.getInstance().getSUB1();
										
								
								// step_9
								LOGGER.info("start the step- 9");
								Home_page.getInstance().getSUB1();
								Home_page.getInstance().getSUB1();
								
								// step_10
								
								LOGGER.info("start the step- 10");
								Home_page.getInstance().getSUB1();
								Home_page.getInstance().getSUB1();
								
								// step_11
								
								LOGGER.info("start the step- 11");
								Home_page.getInstance().getSUB1();
								
								// step_12
								
								LOGGER.info("start the step- 12");
								Home_page.getInstance().getSUB1();
								
								// step_13
								
								LOGGER.info("start the step- 13");
								Home_page.getInstance().getSUB1();
								
								

		}
			
			catch (Exception e) {
				LOGGER.error(e);
				commonutilities.getInstance().takeScreeshot();
			}
		}
		
		@Then("should see the created form")
		public void should_see_the_created_form() {
//			LOG_OUT
			
			try {
			PropertyConfigurator.configure("log4j2.properties");
			// logout
			LOGGER.info("start the step- 14");
			Home_page.getInstance().getLOG_OUT();
			
			LOGGER.info("form creation completed");
		}
			catch (Exception e) {
				LOGGER.error(e);
				commonutilities.getInstance().takeScreeshot();
				}

		}
	}
