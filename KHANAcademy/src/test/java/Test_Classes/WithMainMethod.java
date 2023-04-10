package Test_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Classes.Home;
import POM_Classes.Login;
import POM_Classes.Teachers;


public class WithMainMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.khanacademy.org/");
		
		driver.manage().window().maximize();
		
		Login login =new Login(driver);
		
		login.loginlink();
		login.userName();
		login.passWord();
		login.loginButton();
		
		Home home = new Home(driver);
		
		
		home.Courses();
		home.EditCourses();
		home.cont();
		Thread.sleep(3000);
//		home.IntroToJS();
//		home.IntroToHTML();
//		home.IntroToSQL();
//		home.GamesAndVisualizastion();
//		home.NaturalSimulation();
//		home.Progress();
		Thread.sleep(3000);

//		home.Profile();
//		home.Add();
//		home.Start();
		
		Teachers teachers = new Teachers(driver);
		
		teachers.TeachersTab();
		teachers.ClassCode();
		teachers.EnterCode();
		teachers.Continue();
		teachers.Back();
		teachers.TeachersEmail();
		
		
		
		
		}

}
