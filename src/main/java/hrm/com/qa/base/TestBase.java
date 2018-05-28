package hrm.com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	static Properties prop;
	
	
	public TestBase(){
		prop=new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\udaya\\Desktop\\practies\\Orange\\src\\main\\java\\hrm\\com\\qa\\config\\config.proerties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialize(){
		
//		String browser=prop.getProperty("browser");		
//		
//		if(browser=="chrome"){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			 driver=new ChromeDriver();
//		}else if(browser=="ie"){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			 driver=new ChromeDriver();			
//		}else
//			System.out.println("No browser defined");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
			
		
	}

}
