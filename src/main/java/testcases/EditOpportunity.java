package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class EditOpportunity extends ProjectSpecificMethods {
	@BeforeTest
	public void setdata() {
		 excelfilename= "./data/EditOpp.xlsx";
	}
	
	
	
	@Test(dataProvider="sendData")
	public void runEditOpportunity(String name,String description) throws InterruptedException {
		
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSales()
		.clickSales()
		.clickOpportunity()
		.searchByOpportunityName(name)
		.clickDropDown()
		.clickEdit()
		.editTomorrowDate()
		.editStage()
		.selectDeliverstate()
		.enterDescription(description)
		.clickSaveForEditedOpportunity()
		.verifyEditedOpportunity();

	}

}
