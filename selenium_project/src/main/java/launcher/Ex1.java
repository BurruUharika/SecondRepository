package launcher;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {

	public static void main(String[] args)throws InterruptedException
	
	{
		
	WebDriverManager.chromiumdriver().setup();
	 WebDriver driver = new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.get("https://www.redbus.in/");
	
	 
	 //click date picker
	 driver.findElement(By.xpath(" //i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
	 
	 //navigate to the desired month and year
	 String desiredMonthYear = "May 2025";//desired month and year
	 
	 while (true)
	 {
	WebElement monthYearHoliday = driver.findElement(By.xpath("//*[@id='onwardCal']/div/div[2]"));//Locator for
	String fullText = monthYearHoliday.getText();
	
	
	//Extract only the month and year(first two words)
	String[] parts = fullText.split("\\s+");//Split by one or more spaces
	String monyear = parts[0] + " " + parts[1];//Extract "Dec" and "2024 "
	
	//print for debugging
	System.out.println("Full Text: " + fullText);
	String monthyear = null;
	System.out.println("Extracted Month and Year: " + monthyear);
	
	if (monthyear.equals(desiredMonthYear))
	{
		break;//Exit loop when desired month and year are displayed
		
	}
		 
	Thread.sleep(1000);
	
	//click "Next" button to navigate forward
	driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]]")).click();
		 
	 }
	 Thread.sleep(1000);
	 
	 int desiredDay = 26;//Desired day
	 
	 try
	 {
		//wait
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement dateElement = driver.findElement(By.xpath("//span[text()='"+desiredDay+"']"));
		 //wait for the desired date element to be clickable
		 wait.until(ExpectedConditions.elementToBeClickable(dateElement));
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", dateElement);
		 
		 System.out.println("Date selected successfully.");
	 }
	 catch (Exception e)
	 {
		 System.out.println("unable to select the date: " + e.getMessage()); 
	 }
	 
	 finally
	 {
	 //close the browser
		 //driver.quit();	
		 
		 }
	}}
	
	 
