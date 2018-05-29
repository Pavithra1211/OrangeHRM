package hrm.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.com.qa.base.TestBase;

public class PIMpage extends TestBase {

	public PIMpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_pim_addEmployee")
	private WebElement lnkAddEmployee;

	@FindBy(id = "firstName")
	private WebElement inputFullname;

	@FindBy(id = "middleName")
	private WebElement inputMiddlename;

	@FindBy(id = "lastName")
	private WebElement inputLastname;

	@FindBy(id = "photofile")
	private WebElement boxChoosefile;

	@FindBy(id = "chkLogin")
	private WebElement chkLogindetails;

	@FindBy(id = "user_name")
	private WebElement inputUsername;

	@FindBy(id = "user_password")
	private WebElement inputPassword;

	@FindBy(id = "re_password")
	private WebElement inputConfirmPassword;

	@FindBy(id = "btnSave")
	private WebElement btnSave;

}
