package scripts;

import org.testng.annotations.Test;

import genericLab.BaseClass;
import pom.AddtocartPage;
import pom.SkillraryDemoLogin;
import pom.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
@Test
public void tc1()  {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearButton();
	s.skillraryDemoApp();
	
	SkillraryDemoLogin sd= new SkillraryDemoLogin(driver);
	driverUtilities.switchTabs(driver);
	driverUtilities.mouseHover(driver, sd.getCoursetab());
	sd.selenium();
	
	AddtocartPage ad= new AddtocartPage(driver);
	driverUtilities.doubleClick(driver,ad.getAddbtn());
	ad.addtocartbutton();
	driverUtilities.alertpopup(driver);
	
}
}
