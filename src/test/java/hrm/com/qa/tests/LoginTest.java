package hrm.com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hrm.com.qa.base.TestBase;
import hrm.com.qa.pages.Dashboardpage;
import hrm.com.qa.pages.Leavepage;
import hrm.com.qa.pages.Loginpage;

public class LoginTest extends TestBase{
	
	Loginpage login;
	Dashboardpage dash;
	Leavepage leave;
	
	public LoginTest(){
		super();
	}
	
	
	@BeforeMethod
	public void Setup(){
		initialize();
		login=new Loginpage();
		dash=new Dashboardpage();
		leave=new Leavepage();
	}
	
	
	@Test(priority=0)
	public void fnLogin(){
		login.fnLogin();
		dash.fnClickAssignLeave();
		leave.fnVerifySelected();
		
	}
	
	@Test
	public void testAssigLeave(){
		login.fnLogin();
		leave.fnAssignLeave("29/05/2018", "31/05/2018");
		
	}
	
	
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}
	
	

}
