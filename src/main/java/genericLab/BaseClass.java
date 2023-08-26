package genericLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFileData pdata= new PropertyFileData();
	public WebDriverUtilities driverUtilities=new WebDriverUtilities();
	public Screenshot photo=new Screenshot();
@BeforeMethod
public void openApp() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getData("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

@AfterMethod
//(alwaysRun = true)

public void closeApp(ITestResult result) throws IOException {
	Reporter.setCurrentTestResult(result);
	if(result.getStatus()==ITestResult.FAILURE) {
	photo.getPhoto(driver, "Fail_tc");
	}
	driver.quit();;
}

}
