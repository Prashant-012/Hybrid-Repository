package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLab.BaseClass;
import pom.CoreJavaPage;
import pom.SkillraryLoginPage;
import pom.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException  {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.Searchtextbox(pdata.getData("search"));
		s.Searchbutton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.coreJavaTb();
		
		WishlistPage w=new WishlistPage(driver);
	
		driverUtilities.switchFrame(driver);
		w.playbutton();
		w.pausebutton();
		driverUtilities.switchBack(driver);
		w.wishlist();
		
	}

}
