package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class Login extends ProjectSpecificMethods {
	
	
	@Test
	public void runLogin() throws InterruptedException {
	
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin();
	

}
}
