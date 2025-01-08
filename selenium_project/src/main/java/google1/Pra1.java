package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pra1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// Correct XPath to locate the search bar (tagname with name='q')
		WebElement ele = driver.findElement(By.xpath("//textarea[\"@name='q'\"]"));
		
		// Call the method to highlight the search bar
		highLighterMethod(driver,ele);
	}
	//method to highlight any element
	
	public static void highLighterMethod(WebDriver driver, WebElement element)
	
	{
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	
    // JavaScript to highlight the element by changing its style (background and border)
	
    js.executeScript("arguments[0].setAttribute('style','background:pink;border:2px solid red;');", element);
	
	}

}


