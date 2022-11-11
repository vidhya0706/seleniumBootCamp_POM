package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A5_AccountsPage extends ProjectSpecificMethods{
	
	public A5_AccountsPage(RemoteWebDriver driver) {
		this.driver =driver;
	}
	
	public A5_AccountsPage clickAccountNewName() throws InterruptedException {
		driver.findElement(By.xpath(prop_lang.getProperty("xpath_Clicknewaccount"))).click();
		Thread.sleep(2000);
		return this;
	}
	 
	public A5_AccountsPage enterAccountName(String name) {
		driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickaccountname"))).sendKeys(name);
		return this;
	}
    public A5_AccountsPage selectOwnership() {
    	WebElement element3=driver.findElement(By.xpath(prop_lang.getProperty("xpath_clickownership")));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		
		driver.findElement(By.xpath(prop_lang.getProperty("xpath_selectasPublic"))).click();
		return this;

	}
    public A6_ViewAccount clickSaveAccount() {
		driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicksaveaccount"))).click();
		return new A6_ViewAccount(driver);

	}
    
    public A5_AccountsPage searchByAccountName(String name) {
		
    	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(name +Keys.ENTER);
		return this;

	}
    public A5_AccountsPage clickDropDown() {
    	WebElement element3 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]//a"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		return this;
		
	}
    public A5_AccountsPage clickEdit() {
    	driver.findElement(By.xpath("//a[@title='Edit']")).click();
		return this;

	}
    
    public A5_AccountsPage selectTechnologyPartner() {
    	WebElement element4=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		return this;
	}
    public A5_AccountsPage selectIndustry() {
    	WebElement element5=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[4]"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
		
		WebElement element6=driver.findElement(By.xpath("//span[text()='Healthcare']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", element6);
		return this;
	}
    public A5_AccountsPage enterBillingAddress(String billingaddress) {
    	driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys(billingaddress);
    	return this;
	}
    public A5_AccountsPage enterShippingAddress(String shipaddress) {
    	driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys(shipaddress);
    	return this;
	}
    public A5_AccountsPage selectCustomerPriority() {
    	WebElement element7=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[5]"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();", element7);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		return this;
	}
    public A5_AccountsPage selectSLA() {
    	WebElement element8=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]"));
		JavascriptExecutor executor8= (JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();", element8);
		
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		return this;
	}
    public A5_AccountsPage selectActive() {
    	WebElement element9=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]"));
		JavascriptExecutor executor9= (JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();", element9);
		
		driver.findElement(By.xpath("//span[text()='No']")).click();
		return this;
	}
    public A5_AccountsPage enterUniqueNumber(String phno) {
    	driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(phno);
    	return this;

	}
    public A5_AccountsPage selectUpsellOpportunity() {
    	WebElement element10=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]"));
		JavascriptExecutor executor10= (JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();", element10);
		
		driver.findElement(By.xpath("//span[text()='No']")).click();
		return this;
	}
    
    public A6_ViewAccount clickSaveForEditedAccount() {
    	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    	return new A6_ViewAccount(driver);
	}
}
