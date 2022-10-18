package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLab.BaseClass;
import pom.CoursePage;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillraryDemoApp();
		
		SkillraryDemoLogin sd= new SkillraryDemoLogin(driver);
		driverUtilities.switchTabs(driver);
		Thread.sleep(5000);
		driverUtilities.dropDown(sd.getSelectcourse(),pdata.getData("course"));
		
		CoursePage c= new CoursePage(driver);
		driverUtilities.draganddrop(driver, c.getSeleniumtb(), c.getCatrttb());
		Thread.sleep(5000);
		WebElement loc=c.getLinkdinTb();
		Point p= loc.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		driverUtilities.scrollBar(driver, x, y);
		c.clickLinkdin();
		
		
		
		
	
	}

}
