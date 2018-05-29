package hrm.com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import hrm.com.qa.base.TestBase;

public class Timepage extends TestBase{
	
	public Timepage(){
    	PageFactory.initElements(driver, this);
    }

}
