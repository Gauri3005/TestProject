package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void TestA() {
		System.out.println("TestA Method running");
	}
	
	@Test (timeOut=6000)
	public void TestB() throws InterruptedException {
		System.out.println("TestB Method Running");
		Thread.sleep(5000);
	}
	
	@Test 
	public void TestC() {
		System.out.println("TestC Method Running");
		
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
