package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
@FindBy(id = "Selenium Training")
private WebElement seleniumtb;

@FindBy(id = "cartArea")
private WebElement catrttb;

@FindBy(xpath = "(//i[@class='fa fa-linkedin'])[2]")
private WebElement linkdin;

public CoursePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSeleniumtb() {
	return seleniumtb;
}

public WebElement getCatrttb() {
	return catrttb;
}

public WebElement getLinkdinTb() {
	return linkdin;
}
public void clickLinkdin() {
	linkdin.click();
}

}
