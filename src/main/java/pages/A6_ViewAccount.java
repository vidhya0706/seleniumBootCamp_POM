package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A6_ViewAccount extends ProjectSpecificMethods {
	
	public A6_ViewAccount(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public A6_ViewAccount verifyCreatedAccount(String name) {
		String Account= driver.findElement(By.xpath("//div[@class='testonly-outputNameWithHierarchyIcon slds-grid sfaOutputNameWithHierarchyIcon']//lightning-formatted-text")).getText();
		System.out.println(Account);
		 
		 if(Account.contains(name))
		  {
			System.out.println("Account is created");  
		  }
		  else {
			  System.out.println("Account is not created");
		  }
		 return this;
		

	}
	 
	public A6_ViewAccount verifyEditedAccount() {
		boolean phoneno = driver.findElement(By.xpath("//span[@class='forceOutputPhone slds-truncate']")).isEnabled();
		System.out.println(phoneno);
//Expected Result:
//The Account is Edited Successfully
		if(phoneno=true)
		  {
			System.out.println("Account is Edited");  
		  }
		  else {
			  System.out.println("Account is not edited");
		  }
		return this;
	}
		
		public A6_ViewAccount verifyDeletedAccount() {
			boolean Account = driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']")).isEnabled();
			System.out.println(Account);
			
			if(Account=true)
			  {
				System.out.println("Account is deleted");  
			  }
			  else {
				  System.out.println("Account is not deleted");
		}
			return this;
			
		
		}
}
		

	


