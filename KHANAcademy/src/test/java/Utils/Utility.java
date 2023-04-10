package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void Capturescreenshot(WebDriver driver,int testID) throws IOException
	{
		DateTimeFormatter date = DateTimeFormatter.ofPattern("YYYY-MM-DD HH-MM-SS");
		LocalDateTime now = LocalDateTime.now();
		
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("test-output//ScreenShot//Test-"+ testID +" "+ date.format(now)+".jpeg");
	    FileHandler.copy(source, dest);
	}
	    
//	    public static String getDataFromExcel (String sheet,int row,int cell) throws IOException {
//		
//	    	FileInputStream file = new FileInputStream("C:\\execel demo\\sheet1.xlsx");
//			String data =WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
//			System.out.println(data);
//			return data;
//			
			
			
		    
	    
	

}
