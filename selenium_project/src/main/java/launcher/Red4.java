package launcher;

public class Red4 {

	package launcher;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;
	import java.util.List;

	public class Red4 {

	    public static void main(String[] args) throws InterruptedException {

	        // Setup WebDriver (using WebDriverManager to manage the driver version)
	        WebDriverManager.chromiumdriver().setup();
	        WebDriver driver = new ChromeDriver();
	        
	        // Open the RedBus website
	        driver.get("https://www.redbus.in/");
	        driver.manage().window().maximize();
	        
	        // Open the calendar by clicking the date picker
	        driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2]")).click();

	        // Define the target month, year, and date
	        String targetMonth = "April";
	        String targetYear = "2025";
	        String targetDate = "20";

	        // Loop until we reach the desired month and year (April 2025)
	        while (true) {
	            // Extract the current displayed month and year
	            String monthYearText = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[2])")).getText();
	            String[] arr = monthYearText.split(" ");
	            String currentMonth = arr[0];
	            String currentYear = arr[1];

	            // Check if the displayed month and year are the same as the target
	            if (currentMonth.equalsIgnoreCase(targetMonth) && currentYear.equals(targetYear)) {
	                break; // Exit loop once the correct month and year are found
	            } else {
	                // Click the next button to move to the next month
	                driver.findElement(By.xpath("//div[@class='sc-kAzzGY cCrHkP']")).click();
	                Thread.sleep(1000); // Wait for the calendar to update
	            }
	        }

	        // Now select the target date (April 20, 2025)
	        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable']//td[@class='available']"));
	        for (WebElement ele : allDates) {
	            String dt = ele.getText();
	            if (dt.equals(targetDate)) {
	                ele.click(); // Click on the date (April 20, 2025)
	                break;
	            }
	        }


	}

}
