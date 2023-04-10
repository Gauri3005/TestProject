package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {

	@FindBy (xpath="//span[text()='Teachers']")private WebElement TeachersTab;

	@FindBy (xpath="//a[@role='button']")private WebElement ClassCode;
	
	@FindBy (xpath="//input[@class='_q92ef6']")private WebElement EnterCode;

	@FindBy (xpath="//button[@type='button']")private WebElement Continue;

	@FindBy (xpath="//a[@role='button']")private WebElement Back;

	@FindBy (xpath="//input[@id='coach-email']")private WebElement TeachersEmail;

  public Teachers (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
 
  public void TeachersTab()
  {
	  TeachersTab.click();
  }
  
  public void ClassCode()
  {
	  ClassCode.click();
  }
  
  public void EnterCode()
  {
	  EnterCode.sendKeys("Velo1234");
  }
  public void Continue()
  {
	  Continue.click();
  }
  public void Back()
  {
	  Back.click();
  }
  
  public void TeachersEmail()
  {
	  TeachersEmail.sendKeys("manishDongarwar567@gmail.com");
  }


}
