package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Profile {
	
@FindBy(xpath="(//button[@type='button'])[1]")private WebElement EditProfileTab;
	
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement NickName;

	@FindBy(xpath="//input[@id='username']")private WebElement UserName;

	@FindBy(xpath="//textarea[@id='bio-picker']")private WebElement Bio;

	@FindBy(xpath="//button[@class='_1kc05dg6']")private WebElement Cancle;
	
	public Edit_Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EditProfileTab()
	{
		EditProfileTab.click();
	}
	
	public void NickName()
	{
		NickName.sendKeys("Gauri Shendge");
	}
	public void UserName()
	{
		UserName.sendKeys("gauri567");
	}
	public void Bio()
	{
		Bio.sendKeys("hello,i am a teacher.I am good in math. i have completed engg.in e &tc");
	}
	
	public void Cancle()
	{
		Cancle.click();
	}



}


