package CalendarHandeling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateDate {

	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		Calendar calendar  = Calendar.getInstance();
		
		 String targetdate = "17-july-2025";
		 	
		 SimpleDateFormat targetdateformat = new SimpleDateFormat("dd-MMMM-yyyy");
		 
		 targetdateformat.setLenient(false);
	
		 Date formattedtargetdate =  targetdateformat.parse(targetdate);
		 
		System.out.println(formattedtargetdate);
		
		int targetday = calendar.get(Calendar.DAY_OF_MONTH);
		
		int targetmonth = calendar.get(Calendar.MONTH);
		
		int targetyear = calendar.get(Calendar.YEAR);
		
		//   formattedtargetdate.getDate();		 		
				 
        driver.findElement(By.id("second_date_picker")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]")).click();
		
		 calendar.setTime(formattedtargetdate);

		 System.out.println(targetday +targetmonth +targetyear);
	}

}
