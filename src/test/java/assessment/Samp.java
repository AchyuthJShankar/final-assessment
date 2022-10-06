package assessment;

import org.testng.annotations.Test;


public class Samp {
	 @Test(dependsOnMethods= {"reg"})
	  public void login() {
		  System.out.println("LOGIN");
	  }
	  
	  @Test ()
	  public void reg() {
		  System.out.println("REG");
	  }
	  
	  @Test(dependsOnMethods= {"login"})
	  public void sendMail() {
		  System.out.println("SEND");
	  }
	}
