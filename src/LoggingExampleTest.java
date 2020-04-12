import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {
		
		// use the log file instead of console to see your output , If you close the eclipse still  it will show you your output 
	
		// add log4j.jar to project
		// add log4j.propertie directly inside the src folder [copy it form we transfer folder from desktop-->java & testing--->]
		//create the object in the code
		
		Logger APPLICATION_LOGS= Logger.getLogger("devpinoyLogger"); //copy this devpinoyLogger from log4j properties file
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("We are writing in to a log file");
		APPLICATION_LOGS.debug("starting the test case xyz test");
		APPLICATION_LOGS.debug("strting the test case xyz test1");
		

	}

}
