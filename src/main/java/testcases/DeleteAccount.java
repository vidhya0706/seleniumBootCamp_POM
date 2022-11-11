package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class DeleteAccount extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setdata() {
		 excelfilename= "./data/createAccount.xlsx";
	}
	

	@Test(dataProvider="sendData")
	public void runDeleteAccount(String name) throws InterruptedException, IOException {
	
		//A1_LoginPage lp=new A1_LoginPage();
		
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSales()
		.clickSales().clickAccount()
		.searchByAccountName(name)
		.clickDropDown()
		.clickDelete()
		.deletedAccount()
		.verifyDeletedAccount();

}

}
