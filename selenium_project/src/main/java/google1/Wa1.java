package google1;

import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wa1 {
	
	public static void main(String[] args) throws Exception 
	{
 
//Step 1: Start the first browser session//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // # Open the browser
 driver.get("https://www.google.com/chrome/");  
Object system;
System.out.println("Existing browser session started");

// //Perform some void operations (optional)
System.out.println("Title of the page:");

// Step 2: Close the browser session
driver.wait() ; //# Close the browser
System.out.println("Existing browser session has been closed.");

// Step 3: Start a new browser session

WebDriver driver1 = new ChromeDriver();; // # Open a new browser
WebDriver new_driver;
new_driver.get("https://www.google.com");  //# Navigate to a new opposite

System.out.println("New browser session started.");

//# Perform operations in the new browser
Object search_box = ((Object) new_driver("name", "uha"));             //  # Locate the search bar
((Wa1) search_box).send_keys("Selenium WebDriver");//  # Type into the search bar
((Object) search_box).submit();  //# Submit the search
System.out.println("Search performed in the new browser.");


	}

	private void send_keys(String string) {
		// TODO Auto-generated method stub
		
	}

	
		
}
