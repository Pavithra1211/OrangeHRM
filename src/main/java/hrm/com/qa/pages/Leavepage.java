package hrm.com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.com.qa.base.TestBase;

public class Leavepage extends TestBase{
	
		
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement tabLeave;
	
	@FindBy(name="assignleave[txtEmployee][empName]")
	WebElement inputEmpName;
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement drpLeaveType;
	
	@FindBy(name="assignleave[txtFromDate]")
	WebElement DateFrom;
	
	@FindBy(name="assignleave[txtToDate]")
	WebElement DateTo;
	
	@FindBy(name="assignBtn")
	WebElement btnAssign;
	
	@FindBy(name="assignleave[txtComment]")
	WebElement inputComments;
	
	public Leavepage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public void fnVerifySelected(){
		String tabcolor=tabLeave.getCssValue("color");
		System.out.println(tabcolor);
		
	}
	

}
