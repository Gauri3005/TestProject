package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Start {
	
	@FindBy(xpath="//a[@id='uid-popover-4-wb-id-anchor']")private WebElement StartLink;

	@FindBy(xpath="(//a[@class='_dwmetq'])[1]")private WebElement DrawingBasics;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[2]")private WebElement Coloring ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[3]")private WebElement Variables;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[6]")private WebElement AnimationBasics ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[7]")private WebElement InteractiveProgrames ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[8]")private WebElement CommunityCoder;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[9]")private WebElement VariableResizing ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[12]")private WebElement TextString ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[13]")private WebElement Functions;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[14]")private WebElement Logic ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[15]")private WebElement Debugging ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[16]")private WebElement Looping ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[19]")private WebElement CleanCode;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[22]")private WebElement Array;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[23]")private WebElement Object ;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[24]")private WebElement OOD;
	
	@FindBy(xpath="(//a[@class='_dwmetq'])[25]")private WebElement BetterProgramer;
	
    public Start(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    public void StartLink()
    {
    	StartLink.click();
    }

    public void DrawingBasics()
    {
    	DrawingBasics.click();
    }

    public void Coloring()
    {
    	Coloring.click();
    }

    public void Variables()
    {
    	Variables.click();
    }

    public void AnimationBasics()
    {
    	AnimationBasics.click();
    }

    public void InteractiveProgrames()
    {
    	InteractiveProgrames.click();
    }

    public void CommunityCoder()
    {
    	CommunityCoder.click();
    }

    public void VariableResizing()
    {
    	VariableResizing.click();
    }

    public void TextString()
    {
    	TextString.click();
    }

    public void Functions()
    {
    	Functions.click();
    }

    public void Logic()
    {
    	Logic.click();
    }

    public void Debugging()
    {
    	Debugging.click();
    }

    public void Looping()
    {
    	Looping.click();
    }

    public void CleanCode()
    {
    	CleanCode.click();
    }

    public void Array()
    {
    	Array.click();
    }

    public void Object()
    {
    	Object.click();
    }

    public void OOD()
    {
    	OOD.click();
    }

    public void BetterProgramer()
    {
    	BetterProgramer.click();
    }

   

}
