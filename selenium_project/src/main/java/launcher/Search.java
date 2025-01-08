package launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	
	public void highlighterElement()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		WebElement ele = driver.findElement(By.xpath("//textarea[\\\"@name='q'\\\""));
		
		highLighterMethod(driver,ele);
	}
	//method to highlight any element
	
	public void highLighterMethod(WebDriver driver, WebElement element)
	
	{
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');", element);
	
	}

}


