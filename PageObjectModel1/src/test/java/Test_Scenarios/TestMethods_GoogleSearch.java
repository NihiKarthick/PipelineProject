package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.DemoQAPage;
import objects.GoogleSearchPage;
import objects.Search_Page;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	GoogleSearchPage objectrepo;
	Search_Page PageFactory;

	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
	}

	@Test(priority = 0)
	public void SearchOperation() {
		/*
		 * GoogleSearchPage searchpage = new GoogleSearchPage(driver);
		 * searchpage.Searchgoogle("demoqa");
		 */
		PageFactory = new Search_Page(driver);
		PageFactory.Searchgoogle("Gmail");
	}

	@Test(priority = 1, enabled = false)
	public void VerifyandaccessDemoQA() throws InterruptedException {
		objectrepo = new GoogleSearchPage(driver);
		Thread.sleep(2000);
		objectrepo.ClickDemoQA();
		Thread.sleep(2000);
	}

	@Test(priority = 2, enabled = false)
	public void VerifyLoginApp() throws InterruptedException {
		DemoQAPage Demo = new DemoQAPage(driver);
		Thread.sleep(5000);

		Demo.NavigatingtoLogin();
		Demo.EnterUSerName();
		Demo.EnterPwd();
		Demo.VerifyLogin();

	}

	@AfterTest
	public void aftertest() {
		System.out.println("Search and Verified Successfully");
		driver.quit();
	}

}
