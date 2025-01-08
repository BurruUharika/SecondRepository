package launcher;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bus {

	public static void main(String[] args) throws InterruptedException
	
	
	{
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(); 
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
//click date picker
driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();

//navigate to the desired month and year
String desiredMonthYear = "May 2025"; // desired month and year
while(true)
{
	WebElement monthYearHoliday = driver.findElement(By.xpath("//div/div[2][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']"));
	String fullText = monthYearHoliday.getText();//div/div[2][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']
	
	//Exatact only the month and year(first two words)
	String[] parts = fullText.split("\\s+");//split by one or more spaces
	String monthYear = parts[0] + "  " + parts[1];//extract "Dec and 2024"
	
	//print for debugging
	System.out.println("Full Text: " + fullText);
	System.out.println("Exacted month and year: " + monthYear);
	if (monthYear.equals(desiredMonthYear))
	{
		
		break;//
		
}
Thread.sleep(1000);

driver.findElement(By.xpath("//div/div[3][@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']")).click();

	}

	Thread.sleep(1000);
	
	int desiredDay = 26; //desired day
	

	
		try	
		{
		
		
		//wait
		
		        WebDriverWait wait = new webDriverwait(driver, Duration.ofSeconds(10));
				WebElement dateElement = driver.findElement(By.xpath("//span[text()=' "+desiredDay+"']"));
				//wait for the desired date element to be clickable
				wait.until(ExpectedConditions.elementToBeClickable)
				JavaScriptExecutor js = (JavaScriptExecutor) driver;
				System.out.println("Date selected successfully.");
	}
	catch (Exception e)
	{
		System.out.println("unable to select the date: " + e.getMessage());	
	}
	finally
	{
		//close
		//driver.quit();
	
		
	}
		
}

