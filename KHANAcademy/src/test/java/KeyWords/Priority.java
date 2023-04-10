package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test (priority=1)/// validation point
	public void TestA() {
		System.out.println("TestA Method running");
	}
	
	@Test (priority=0)// validation point
	public void TestB() {
		System.out.println("TestB Method Running");
	}
	
	@Test (priority=-1)// validation point
	public void TestC() {
		System.out.println("TestC Method Running");
		
	}
	@Test (priority=0)// validation point
	public void ATestD() {
		System.out.println("TestD Method Running");
	}
	
	@Test (priority=9)// validation point
	public void TestE() {
		System.out.println("TestE Method Running");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

}
