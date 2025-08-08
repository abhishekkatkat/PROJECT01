package DesoredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeOptionss {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		options.addArguments("--incognito");

		
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.manage().window().maximize();
	
		driver.get("http://www.cacert.org/");
	}

}
