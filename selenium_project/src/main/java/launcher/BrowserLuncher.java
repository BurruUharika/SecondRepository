package launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLuncher 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "driver path need to provide");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		//WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.ajio.com/");
		
		//WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}

}


