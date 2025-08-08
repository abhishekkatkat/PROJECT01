package SELENIUMPROJECT01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Whistlist {
	
	
          WebDriver driver;
          
          @BeforeMethod
          public void setup() {
        	  
        	  driver = new ChromeDriver();
        	  driver.manage().window().maximize();
        	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        	  
          }
          
          @Test   (priority=1)
          
          public void addtowhistlist() throws InterruptedException {
        	  
        	  driver.get("https://shoppersstack.com/");
        	  driver.findElement(By.id("loginBtn")).click();
        	  driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
      	      driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
      	      driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
      	      driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
      	      driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
      	     
      	      System.out.println("Successfully logged in");
      	      
      	    Thread.sleep(2000);
      	      driver.findElement(By.xpath("//a[@id='electronicsProd']")).click();
        	  driver.findElement(By.xpath("//div[@class='cat_box__jl5G7']//div[1]//div[3]//div[2]//*[name()='svg']//*[name()='path' and contains(@d,'m12 21.35-')]")).click();
        	  driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")).click();
        	  driver.findElement(By.xpath("//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"][2]")).click();
        	  Thread.sleep(1000);
        	  driver.close();
        	  
      	      
      	      
          }
          
          @Test (priority=2)
          public void removeprodfromwhistlist() throws InterruptedException  {
        	  
        	  driver.get("https://shoppersstack.com/");
        	  driver.findElement(By.id("loginBtn")).click();
        	  driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
      	      driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
      	      driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
      	      driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
      	      driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
      	      Thread.sleep(2000);
      	      driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")).click();
      	      driver.findElement(By.xpath("//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\"][2]")).click();
        	  driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedWarning MuiButton-sizeMedium MuiButton-outlinedSizeMedium  css-b6lg9m\"]")).click();
              driver.switchTo().alert().accept();
        	  
        	 
        	  
          }
          
          
}
