package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	// This is Pre-Condition to set the driver

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By Searchbox = By.xpath("//textarea[@name='q']");
	By Searchbtn = By.xpath("//input[@name='btnK'][1]");
	By Demo_Link = By.xpath("//a//h3[text()='DEMOQA'][1]");

	public void Searchgoogle(String SearchInput) {
		try {
			driver.findElement(Searchbox).sendKeys(SearchInput);
			Thread.sleep(2000);
			driver.findElement(Searchbtn).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("System Captured unidentifed errors" + e.getMessage());
		}

	}

	public void ClickDemoQA() {
		try {
			driver.findElement(Demo_Link).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught Unidentified Error" + e.getMessage());
		}
	}
}
