package Test_Classes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Classes.Edit_Profile;
import POM_Classes.Login;
import POM_Classes.Logout;
import POM_Classes.Profile;
import POM_Classes.Progress;
import POM_Classes.Teachers;
import Utils.Utility;

public class Cross_Browser {
	
	public class CrossBrowser extends BaseClass_CrossBrowser {
		
		WebDriver driver;
		Login login;
		Teachers teacher;
		Logout logout;
		Profile profile;
		Edit_Profile editprofile;
		Progress progress;
		int testID;
		
		@Parameters("browser")
		
		@BeforeTest
		
		public void OpenBrowser(String browsername)
		{
			System.out.println(browsername);
			
			if (browsername.equals("Chrome"))
			{
				driver = OpenChromeBrowser();	
			}
			
			if (browsername.equals("Edge"))
			{
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauri\\project\\edgedriver_win64\\msedgedriver.exe");
				  driver = OpenEdgeBrowser();	
			}
			
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			  driver.manage().window().maximize();
			  
			  driver.get("https://www.khanacademy.org/");
			
		}
		
		@BeforeClass
		
		public void beforeClass()
		{
		 login=new Login(driver);
		 teacher=new Teachers(driver);
		 profile = new Profile(driver);
		 editprofile = new Edit_Profile(driver);
		 progress=new Progress(driver);
		 logout = new Logout(driver);

		}

	@BeforeMethod

	public void beforeMethod()
	{
		login.loginlink();
		login.userName();
		login.passWord();
		login.loginButton();
	}

	@Test

	public void To_Verify_TeacherPage()
	{ testID=1;
		
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
	{ testID=2;
		
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
	{  testID=4;
		 editprofile = new Edit_Profile(driver);
		
		//profile.ProfileTab();
		editprofile.NickName();
		editprofile.UserName();
		editprofile.Bio();
		editprofile.Cancle();
		
		
	}

	@Test

	public void To_Verify_ProgressPage()
	{  testID=3;
		progress=new Progress(driver);
		
	  progress.ProgressTab();
	  progress.Last7Days();
	//  progress.AllContent();
	//  progress.AllActivity();
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

	public void afterMethod (ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus() )
//			Utility.CaptureSC(driver, testID);
		
		logout = new Logout(driver);
		
		logout.ClickOnProfile();
		logout.LogoutButton();
		
	}
		
	@AfterClass

	public void afterClass()
	{
		login=null;
		teacher=null;
		profile =null;
		editprofile =null;
		progress = null;
		logout = null;
	}

	@AfterTest

		public void afterTest()
		{
		  System.gc();
		driver.close();
	    }

}
}
