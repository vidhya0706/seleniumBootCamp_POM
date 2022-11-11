package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class CreateAccount extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setdata() {
		 excelfilename= "./data/createAccount.xlsx";
	}
	

	@Test(dataProvider="sendData")
	public void runCreateOpportunity(String name) throws InterruptedException {
	
		//A1_LoginPage lp=new A1_LoginPage();
		
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSales()
		.clickSales().clickAccount()
		.clickAccountNewName()
		.enterAccountName(name)
		.selectOwnership()
		.clickSaveAccount()
		.verifyCreatedAccount(name);

}
}
