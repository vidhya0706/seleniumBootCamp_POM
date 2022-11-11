package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class EditAccount extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setdata() {
		 excelfilename= "./data/editAccount.xlsx";
	}
	

	@Test(dataProvider="sendData")
	public void runEditAccount(String name,String shipaddress,String billingaddress,String phno) throws InterruptedException {
	
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
		.clickEdit()
		.selectTechnologyPartner()
		.selectIndustry()
		.enterBillingAddress(billingaddress)
		.enterShippingAddress(shipaddress)
		.selectCustomerPriority()
		.selectSLA()
		.selectActive()
		.enterUniqueNumber(phno)
		.selectUpsellOpportunity()
		.clickSaveForEditedAccount();
		

}

}
