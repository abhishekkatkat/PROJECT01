package Assignment02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		
		List <WebElement> row = table.findElements(By.xpath("//table[@class='dataTable']//tbody/td"));
		
		System.out.println("Company Names = ");
		
		for(WebElement rows : row) {
			
			
			WebElement Tablecell = rows.findElement(By.tagName("td"));
			
			String companyname = Tablecell.getTagName();
			
			System.out.println(companyname +Tablecell.getText());
				
			
		}
				
	}

}
