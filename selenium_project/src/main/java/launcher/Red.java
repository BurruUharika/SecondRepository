package launcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class Red {

public static void main(String[] args) throws Exception
{
	
// Setup WebDriver (assuming you have ChromeDriver installed)
WebDriverManager.chromiumdriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();

// Open the calendar (Onward Date)

driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
// Define the target month, year, and date

String month = " April";
String year = "2025";
String date = "20";
// Loop until the calendar displays the desired month and year (April 2025)
while (true) {
// Extract the current displayed month and year
String monthYearText = driver.findElement(By.xpath("//div/div[2]/div/div/div[1]/div[2]")).getText();
String[] arr = monthYearText.split("//+s ");
String currentMonth = arr[0];
String currentYear = arr[0];
// Check if the displayed month and year are correct
if (currentMonth.equalsIgnoreCase(month) && currentYear.equals(year)) {
break; // Desired month and year found
} else {
// Click the next button to move to the next month
driver.findElement(By.xpath("//span[@class='rb-calendar-next']]")).click();
}
}
// Now that we've navigated to April 2025, select the 20th date
List<WebElement> allDates = driver.findElements(By.xpath("//body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/span[1]/div[5]"));
for (WebElement ele : allDates) {
String dt = ele.getText();
if (dt.equals(date)) {
ele.click(); // Click the date
break;
}
}


WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='wd day']//div[text()='\" + date + \"']")));
nextButton.click();
// Close the driver after use
driver.quit();
}
}