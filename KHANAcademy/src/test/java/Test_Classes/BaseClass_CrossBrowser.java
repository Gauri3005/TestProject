package Test_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass_CrossBrowser {
	
	public WebDriver OpenChromeBrowser()
	{
//	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauri\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	   return driver;
	}
	
	public WebDriver OpenEdgeBrowser()

	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauri\\project\\edgedriver_win64\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();
	   return driver;
	}


}
