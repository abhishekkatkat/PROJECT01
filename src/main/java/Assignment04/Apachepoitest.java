package Assignment04;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apachepoitest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String expth = "C:\\FSI-2023-DOWNLOAD.xlsx";
		
		
	   FileInputStream fis = new FileInputStream(expth);

	   try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
		String username =  wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		   
		   System.out.println(username );
		   
		   
		   String password = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		   
		   System.out.println(password);
		   
		   
		   wb.close();
		   
		   
		   	WebDriver driver = new ChromeDriver();
		   	
		   	driver.get("http://demo.guru99.com/V4/");
		   	
		   	driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(username);
		   	
		   	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		   	
		   	driver.findElement(By.name("btnLogin")).click();
		   	
		   	driver.quit();
	}
	   
	   
	}

}
