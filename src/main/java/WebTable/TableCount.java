package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List <WebElement> rows = table.findElements(By.tagName("tr"));
		
		System.out.println("Total number of rows in the web table = " +rows.size());
		
		List<WebElement> column = rows.getFirst().findElements(By.tagName("td"));
		
		System.out.println(" Total number of columns in the Web Table = "+column.size());
		
     	driver.quit();
     	
     	
		
	
		
		
		

	}

}
