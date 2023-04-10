package Test_Classes;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Classes.Edit_Profile;
import POM_Classes.Login;
import POM_Classes.Logout;
import POM_Classes.Profile;
import POM_Classes.Progress;
import POM_Classes.Teachers;
import Utils.Utility;

public class Validation_Class {

	public class ValidationClass extends Baseclass_SC {
		
		int testID;
		WebDriver driver;
		Login login;
		Teachers teacher;
		Logout logout;
		Profile profile;
		Edit_Profile editprofile;
		Progress progress;
		
	@BeforeClass
		
		public void beforeClass()
		{

		  driver = new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.khanacademy.org/");
		
		}

	@BeforeMethod

	public void beforeMethod()
	{
		Login login=new Login(driver);
		
		login.loginlink();
		login.userName();
		login.passWord();
		login.loginButton();
	}

	@Test

	public void To_Verify_TeacherPage()
	{  testID =3;
		 teacher=new Teachers(driver);
		
		teacher.TeachersTab();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		if(url.equals("https://www.khanacademy.org/profile/me/teachers"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}

	@Test

	public void To_Verify_ProfilePage()
	{   testID=4;
		 profile = new Profile(driver);
		
		profile.ProfileTab();
		profile.EditProfile();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		if(url.equals("https://www.khanacademy.org/profile/me/"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}

	@Test

	public void To_Verify_EditprofilePage()
	{  testID =2;
		 editprofile = new Edit_Profile(driver);
		
		profile.ProfileTab();
		editprofile.NickName();
		editprofile.UserName();
		editprofile.Bio();
		editprofile.Cancle();
		
		
	}

	@Test

	public void To_Verify_ProgressPage()
	{   testID =1;
		progress=new Progress(driver);
		
	    progress.ProgressTab();
	    progress.Last7Days();
//	    progress.AllContent();
//	    progress.AllActivity();
	    String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		if(url.equals("https://www.khanacademy.org/profile/me/progress"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
	}

	@AfterMethod

	public void afterMethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
			Utility.Capturescreenshot(driver, testID);
		
		logout = new Logout(driver);
		
		logout.ClickOnProfile();
		logout.LogoutButton();
		
//		Utility.getDataFromExcel("sheet1", 3, 2);
		
	}
	
	
		
	@AfterClass

	public void afterClass()
	{
		driver.close();
	}
}
}
