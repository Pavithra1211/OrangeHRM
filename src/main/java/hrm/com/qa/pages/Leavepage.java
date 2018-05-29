package hrm.com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hrm.com.qa.base.TestBase;

public class Leavepage extends TestBase {

	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement tabLeave;

	@FindBy(name = "assignleave[txtEmployee][empName]")
	WebElement inputEmpName;

	@FindBy(id = "assignleave_txtLeaveType")
	WebElement drpLeaveType;

	@FindBy(name = "assignleave[txtFromDate]")
	WebElement DateFrom;

	@FindBy(name = "assignleave[txtToDate]")
	WebElement DateTo;

	@FindBy(name = "assignBtn")
	WebElement btnAssign;

	@FindBy(name = "assignleave[txtComment]")
	WebElement inputComments;

	// Assign Leave Module

	@FindBy(id = "menu_leave_assignLeave")
	WebElement lnkAssignLeave;

	public Leavepage() {
		PageFactory.initElements(driver, this);
	}

	public void fnVerifySelected() {
		String tabcolor = tabLeave.getCssValue("color");
		System.out.println(tabcolor);
	}

	public void fnAssignLeave(String FromDate,String ToDate) {
		tabLeave.click();
		lnkAssignLeave.click();
		inputEmpName.sendKeys("Robert Craig");
		Select se = new Select(drpLeaveType);
		se.selectByVisibleText("Vacation US");

		// Select date by js

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("argumets[0].setAttribute('value','" + FromDate + "');", DateFrom);
		js.executeScript("argumets[0].setAttribute('value','" + ToDate + "');", DateTo);
		inputComments.sendKeys("Vacation Leave");
		btnAssign.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
}
