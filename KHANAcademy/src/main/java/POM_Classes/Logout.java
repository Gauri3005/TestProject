package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']")private WebElement ClickOnProfile;
	
	@FindBy(xpath="//a[@class='_71vn8x8']")private WebElement LogoutButton;

	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnProfile()
	{
		ClickOnProfile.click();
	}
	
	public void LogoutButton()
	{
		LogoutButton.click();
	}
}


