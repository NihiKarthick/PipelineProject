package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

	WebDriver driver;
	// This is Pre-Condition to set the driver

	public Search_Page(WebDriver driver) {
		// this keyword will point to the current focussing or active element
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@name='q']")
	public WebElement Searchbox;
	@FindBy(xpath = "//input[@name='btnK'][1]")
	public WebElement Searchbtn;
	@FindBy(xpath = "//a//h3[text()='DEMOQA'][1]")
	public WebElement Demo_Link;

	public void Searchgoogle(String SearchInput) {
		try {
			Searchbox.sendKeys(SearchInput);
			Searchbtn.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("System Captured unidentifed errors" + e.getMessage());
		}

	}

	public void ClickDemoQA() {
		try {
			Demo_Link.click();

			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught Unidentified Error" + e.getMessage());
		}
	}
}
