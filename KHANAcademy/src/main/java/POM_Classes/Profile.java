package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
@FindBy(xpath="//a[@class='_158ir6wt']")private WebElement ProfileTab;
	
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement EditProfile;

	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ProfileTab()
	{
		ProfileTab.click();
	}
	
	public void EditProfile()
	{
		EditProfile.click();
	}

}
