package launcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gob2{
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        
        try {
            // Step 1: Navigate to Goibibo//
            driver.get("https://www.goibibo.com/");
            
            // Step 2: Click on the date picker input
            WebElement datePicker = driver.findElement(By.id("//*[@id=\"root\"]/div[5]/div/div/div[2]/div[3]/div/p[1]")); // Adjust locator
            datePicker.click();

            // Desired date details
            String targetMonthYear = "July 2025";
            String targetDay = "10";
         // Step 3: Navigate to the desired month and year
            while (true) {
                // Get the current displayed month and year
                WebElement monthYearElement = driver.findElement(By.className("//div[@class=\"sc-1f95z5i-72 iENbjQ\"]")); // Adjust locator
                String currentMonthYear = monthYearElement.getText();

                if (currentMonthYear.equals(targetMonthYear)) {
                    break; // Stop if the correct month and year are displayed
                }

                // Click the "Next" button to navigate to the next month
                WebElement nextButton = driver.findElement(By.className("span[aria-label='Next Month']"));
                nextButton.click();
                
                // Add a small delay to allow the UI to update
                Thread.sleep(500);
            }
                
                
             // Step 4: Select the desired day
                WebElement targetDate = driver.findElement(By.xpath("(//p[normalize-space()=\"10 Jul'25\"])[1]"));
                targetDate.click();
                // Additional operations (if needed)
                System.out.println("Date selected: July 10th, 2025");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();
            }
        }
    
}
		
		
		
		
		
		
        
		
		
	
	
	
	
	

    