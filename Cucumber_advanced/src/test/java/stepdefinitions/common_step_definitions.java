package stepdefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fb.utility.Driver_Managers;
import com.utilities.commonutilities;

import stepdefinitions.common_step_definitions;
import io.cucumber.java.Before;

public class common_step_definitions {
	
	private static String ScenarioName=null;
	
	
	
	 static final Logger LOGGER = LogManager.getLogger(common_step_definitions.class);


		@Before 
		public void beforeScenraio() {
			
			LOGGER.info("start-1");
		
			try {
				LOGGER.info("start-2");
				commonutilities.getInstance().loadproperties();
								
				LOGGER.info("start-3");
				if(Driver_Managers.getDriver() == null) {
					Driver_Managers.launch_brower();
					commonutilities.getInstance().initWebElements();
				}
				
			}
			
			catch(Exception e)
			{
				LOGGER.info("start-3");
				e.printStackTrace();
			}
			
			
		}


		public static String getScenarioName() {
			// TODO Auto-generated method stub
			return null;
		}


}
