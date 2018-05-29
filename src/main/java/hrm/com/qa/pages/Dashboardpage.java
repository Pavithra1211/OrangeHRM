package hrm.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hrm.com.qa.base.TestBase;

public class Dashboardpage extends TestBase {

	@FindBy(id = "menu_dashboard_index")
	WebElement tabDashboard;

	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement AssignLeave;

	@FindBy(xpath = "//span[contains(text(),'Timesheets')]")
	WebElement Timesheets;

	@FindBy(xpath = "//span[contains(text(),'Leave List')]")
	WebElement LeaveList;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement hdrDashboard;

	public Dashboardpage() {
		PageFactory.initElements(driver, this);

	}

	public void verifyDashboard() {
		Assert.assertEquals(hdrDashboard.isDisplayed(), true);

	}

	public void fnClcikAssignLeave() {
		AssignLeave.click();

	}

}
