package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A1_LoginPage extends ProjectSpecificMethods {
	
	public A1_LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	
	public A1_LoginPage enterUsername() {
		driver.findElement(By.id(prop_lang.getProperty("Login_id"))).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
    
	public A1_LoginPage enterPasssword() {
		driver.findElement(By.id(prop_lang.getProperty("Password_id"))).sendKeys("Testleaf$321");
        return this;
	}
	
    public A2_HomePage clickLogin() {
    	driver.findElement(By.xpath(prop_lang.getProperty("xpath_Submit"))).click();
        return new A2_HomePage(driver);
	}

}
