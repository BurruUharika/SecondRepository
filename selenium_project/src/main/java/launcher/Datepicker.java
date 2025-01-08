package launcher;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		 WebDriver driver = new ChromeDriver();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in/");
		 
		String desired_month = "July";
		String desired_date = "10";
		String desired_year ="2025";
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		while(true){
			
			String monthyear = driver.findElement(By.xpath("//div/div[2]/div/div/div[1]/div[2]")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			
			if(mon.equalsIgnoreCase(mon) && yr.equals(yr))
				
				break;
			driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
			
		}
		
		
		List<WebElement> alldates=(List<WebElement>) driver.findElement(By.xpath("//div/div[2]/div/div/div[3]/div[3]/span/div[4]/span"));
		for(WebElement ele:alldates)
		{
			String dt=ele.getText();
			Object date = null;
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}
		
	}

}
