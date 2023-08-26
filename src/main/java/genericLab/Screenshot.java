package genericLab;

import java.io.File; 
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Screenshot {
public void getPhoto(WebDriver driver,String name) throws IOException {
	
	Date d=new Date();
	String currentdate= d.toString().replace(":", "_");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(AutoConstant.photopath+name+currentdate+".png");
	FileUtils.copyFile(src, dest);
	Reporter.log("<img src='"+dest+"' height='400' width='400' /> ");

}
}
