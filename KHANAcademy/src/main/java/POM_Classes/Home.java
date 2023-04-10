package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


	
		
//		@FindBy(xpath="//button[@type='button']") private WebElement EditProfile;                  //declaration
		
		@FindBy(xpath="(//span[@class='_g20yn58'])[2]") private WebElement Courses;                  //declaration
		
		@FindBy(xpath="//button[@class='_12iepmsr']") private WebElement EditCourses; 
		
		@FindBy(xpath="(//div[@class='_1yok8f4'])[2]")private WebElement cont;
	    
//		@FindBy(xpath="(//div[@class='_1xz0fezn'])[1]") private WebElement IntroToJS;
	//
//		@FindBy(xpath="(//div[@class='_1xz0fezn'])[2]") private WebElement IntroToHTML;
	//
//		@FindBy(xpath="(//div[@class='_1xz0fezn'])[3]") private WebElement IntroToSQL;
	//
//		@FindBy(xpath="(//div[@class='_1xz0fezn'])[4]") private WebElement GamesAndVisualizastion;
	//	
//		@FindBy(xpath="(//div[@class='_1xz0fezn'])[5]") private WebElement NaturalSimulation;
		
//		@FindBy(xpath="//span[text()='Progress']")private WebElement Progress;
	//	
//		@FindBy(xpath="//span[text()='Profile']")private WebElement Profile;
	//	
//		@FindBy(xpath="//button[@class='_1ckw276']")private WebElement Add;
	//	
//		@FindBy(xpath="//a[@id='uid-popover-4-wb-id-anchor']") private WebElement Start;                  //declaration

		
	    public Home (WebDriver driver)                          //initialization
	    {
	    	PageFactory.initElements(driver,this );
	    }
	                  
	   
	    
	    public void Courses()                                   //utilization
	    {
	    	Courses.click();
	    }
	    
	    public void EditCourses()
	    {
	    	EditCourses.click();
	    }
	    
	    public void cont()
	    {
	    	cont.click();
	    }
	    
//	    public void IntroToJS()
//	    {
//	    	IntroToJS.click();
//	    }
	//    
//	    public void  IntroToHTML()
//	    {
//	    	 IntroToHTML.click();
//	    }
	//    
//	    public void IntroToSQL()
//	    {
//	    	IntroToSQL.click();
//	    }
	//    
//	    public void GamesAndVisualizastion()
//	    {
//	    	GamesAndVisualizastion.click();
//	    }
	//    
//	    public void NaturalSimulation()
//	    {
//	    	NaturalSimulation.click();
//	    }
	//    
//	    public void Progress()
//	    {
//	    	Progress.click();	
//	    }
	//   
	//    
//	    public void Profile()
//	    {
//	    	Profile.click();	
//	    }
	//    
//	    public void Add()
//	    {
//	    	Add.click();	
//	    }
	//    
//	    public void Start()
//	    {
//	    	Start.click();	
//	    }
	    
	   
	    
	    
	    
	    
	    
	}


