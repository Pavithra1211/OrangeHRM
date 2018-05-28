package hrm.com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.com.qa.base.TestBase;

public class Loginpage extends TestBase{
	
	
	@FindBy(id="txtUsername")
	WebElement inputusername;
	
	@FindBy(id="txtPassword")
	WebElement inputpassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	//To initiate web elements
	
	public Loginpage(){
		PageFactory.initElements(driver, this);		
	}
	
	
	 public Dashboardpage fnLogin(){ 	
		 inputusername.sendKeys("Admin");	  
		 inputpassword.sendKeys("admin");	  
		 btnLogin.click();
		 return new Dashboardpage();
	 }	
	 
	 

}
