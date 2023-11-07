package testngBeforesuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Personal_Loan {
	
	@BeforeSuite
	public void specialtest() {
		System.out.println("Special Loan for Poverty people");
	}

	
	@Test(enabled = false)
	public void test3() {
		System.out.println("Personal loan is given successfully");
	}
	
	@AfterSuite
	public void specialtest1() {
		System.out.println("Special Loan for Farmer people");
	}
	
}
