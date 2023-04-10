package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//a[text()='Login']") private WebElement loginlink;

	@FindBy(xpath="//input[@type='text']") private WebElement userName;

	@FindBy(xpath="//input[@type='password']") private WebElement passWord;

	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	
	//To initialize variables
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//To utilize variables
	
	public void loginlink()
	{
		loginlink.click();
	}
	
	public void userName()
	{
		userName.sendKeys("gauri25993@gmail.com");
	}
	
	public void  passWord()
	{
		passWord.sendKeys("gauri@1993");
	}
	
	public void loginButton()
	{
		loginButton.click();
	}
	

}
