package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {
	
@FindBy(xpath="//a[@class='_158ir6wt']")private WebElement ProgressTab;
	
	@FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div[2]/div/div[4]/div/div[2]/div[1]/div/div[1]/div[1]/button/svg")private WebElement Last7Days;
//	@FindBy(xpath="(//button[@class='_14wjxigb'])[2]")private WebElement AllContent;
//
//	@FindBy(xpath="(//button[@class='_14wjxigb'])[3]")private WebElement AllActivity;



	public Progress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ProgressTab()
	{
		ProgressTab.click();
	}
	
	public void Last7Days()
	{
		Last7Days.click();
		
	}
//	public void AllContent()
//	{
//		AllContent.click();
//	}
//	
//	public void AllActivity()
//	{
//		AllActivity.click();
//	}

}
