package Test_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass_SC {
	
	public WebDriver OpenChromedriver()
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauri\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	   return driver;
	}
	
	public WebDriver OpenEdgedriver()

	{
       WebDriver driver = new EdgeDriver();
	   return driver;
	}


}
