package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class DemoQAPage {

	WebDriver driver;
	// This is Pre-Condition to set the driver

	public DemoQAPage(WebDriver driver) {
		this.driver = driver;
	}
	// WebElement Element = driver.findElement(By.xpath("//div//h5[text()='Book
	// Store Application']"));

	By Redirect_login = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[1]");
	By LoginBtn = By.id("login");
	By uName = By.id("userName");
	By pswd = By.id("password");
	By loginBtn = By.id("login");

	public void NavigatingtoLogin() throws InterruptedException {
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", Element);

		driver.findElement(Redirect_login).click();
		Thread.sleep(2000);
		driver.findElement(LoginBtn).click();
	}

	public void EnterUSerName() {
		driver.findElement(uName).sendKeys("gunjankaushik");
	}

	public void EnterPwd() {
		driver.findElement(pswd).sendKeys("Password@123");
	}

	public void VerifyLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(loginBtn).click();
		String title = driver.getTitle();
		assertEquals(title, "DEMOQA");
	}

}
