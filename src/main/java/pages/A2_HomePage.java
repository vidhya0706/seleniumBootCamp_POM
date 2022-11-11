package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A2_HomePage extends ProjectSpecificMethods {
	
	public A2_HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public A2_HomePage clickAppLauncher() {
		WebElement element = driver.findElement(By.xpath(prop_lang.getProperty("xpath.AppLauncher")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
        return this;
	}
	
	public A2_HomePage clickViewAll() {
		
		driver.findElement(By.xpath(prop_lang.getProperty("xpath.viewAll"))).click();
        return this;
	}
	
	public A2_HomePage enterSales() throws InterruptedException {
		driver.findElement(By.xpath(prop_lang.getProperty("xpath_Entersales"))).sendKeys("Sales");
		Thread.sleep(2000);
		return this;

	}
	
	public A2_HomePage clickSales() throws InterruptedException {
		WebElement element1 =driver.findElement(By.xpath(prop_lang.getProperty("xpath_clicksales")));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);	
		Thread.sleep(2000);
        return this;
	}
	
	public A3_OpportunityPage clickOpportunity() {
		//WebElement element2=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		WebElement element2=driver.findElement(By.xpath(prop_lang.getProperty("xpath_Clickopportunities")));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		//driver.findElement(By.linkText(prop_lang.getProperty("Link_text_Createopportunities"))).click();
        return new A3_OpportunityPage(driver);
	}
	
	public A5_AccountsPage clickAccount() {
		WebElement element3=driver.findElement(By.xpath(prop_lang.getProperty("xpath_Clickaccounts")));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
		return new A5_AccountsPage(driver);

	}
	
	
	
	

}
