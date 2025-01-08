package launcher;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex2 {

public static void main(String[] args) throws Exception {

// Setup WebDriver
WebDriverManager.chromedriver().setup();    
WebDriver driver = new ChromeDriver();

// Implicit wait setup
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

// Step 1: Open Goibibo
driver.get("https://www.goibibo.com/");

// Step 2: Open the Departure Date Picker
WebElement departureElement = driver.findElement(By.xpath("//span[normalize-space()='Departure']"));
Object js;
((JavascriptExecutor) driver).executeScript("arguments[0].click();", departureElement);
// Target month and date
String targetMonthYear = "July 2025";
String targetDate = "10";

// Step 3: Navigate to the correct month
while (true) {
// Get the currently displayed month and year in the date picker
String currentMonthYear = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='sc-1gt8xf5-0 bPZJjI']/div[@class='sc-1gt8xf5-3 helaNf']/div[@class='sc-12foipm-16 wfIEw']/div[@class='sc-12foipm-0 iiZOql']/div[@class='sc-12foipm-20 jPzQOy']/div[@class='sc-12foipm-39 dkOpZJ']/div[@class='sc-12foipm-41 cILJHS']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]/div[1]")).getText();

// If the displayed month matches the target month, break the loop
if (currentMonthYear.equals(targetMonthYear)) {
break;
}

// Click on the "Next Month" button to move to the next month
driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
}

 // Step 4: Select the target date
 List<WebElement> dates = driver.findElements(By.xpath("(//p[@class='fsw__date' and normalize-space(text())='10']"));
boolean dateSelected = false;
        
for (WebElement date : dates) {
 if (date.getText().equals("10")) {
date.click();
 dateSelected = true;
 break;
}
 }

        // Step 5: Confirmation
        if (dateSelected) {
            System.out.println("Date successfully selected: July 10, 2025");
        } else {
            System.out.println("Date not selected.");
        }

        // Step 6: Close the browser
        driver.quit();
    }
}
	

	
