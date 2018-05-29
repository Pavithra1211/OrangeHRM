package hrm.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.com.qa.base.TestBase;

public class Loginpage extends TestBase {

	@FindBy(xpath = "//div[@id='divLogo']//img")
	private WebElement logoOrangeHRM;

	@FindBy(id = "txtUsername")
	WebElement inputusername;

	@FindBy(id = "txtPassword")
	WebElement inputpassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	// To initiate web elements

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement tabAdmin;

	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement tabPIM;

	@FindBy(id = "menu_leave_viewLeaveModule")
	private WebElement tabLeave;

	@FindBy(id = "menu_time_viewTimeModule")
	private WebElement tabTime;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	private WebElement tabRecruitement;

	@FindBy(id = "menu__Performance")
	private WebElement tabPerformance;

	@FindBy(id = "menu_directory_viewDirectory")
	private WebElement tabDirectory;

	@FindBy(id = "")
	private WebElement tab;

	public PIMpage fnClickPIM() {
		tabPIM.click();
		return new PIMpage();
	}

	public Leavepage fnClickLeave() {
		tabLeave.click();
		return new Leavepage();
	}

	public Timepage fnClickTime() {
		tabTime.click();
		return new Timepage();
	}

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	public Dashboardpage fnLogin() {
		inputusername.sendKeys("Admin");
		inputpassword.sendKeys("admin");
		btnLogin.click();
		return new Dashboardpage();
	}

}
