
public class W1 {

	public static void main(String[] args) {
		
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.Capabilities;
		import org.openqa.selenium.By;
		import java.util.Map;
		import org.openqa.selenium.WebDriver;
		import java.util.concurrent.TimeUnit;
		public class ConnectBrwSession{
		   public static void main(String[] args)
		   throws InterruptedException{
		      System.setProperty("webdriver.chrome.driver",
		         "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      //object of ChromeOptions class
		      ChromeOptions o = new ChromeOptions();
		      //setting debuggerAddress value
		      o.setExperimentalOption("debuggerAddress", "localhost:61861");
		      //add options to browser capabilities
		      Capabilities c = driver.getCapabilities(o);
		      Map<String, Object> m = c.asMap();
		      m.forEach((key, value) −> {
		         System.out.println("Key is: " + key + " Value is: " + value);
		      });
		      //set implicit wait
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      //identify element
		      WebElement l = driver.findElement(By.id("gsc−i−id1"));
		      //remove existing data in edit box
		      l.clear();
		      l.sendKeys("Tutorialspoint");
		      String s = l.getAttribute("value");
		      System.out.println("Attribute value: " + s);
		   }
		}
		
		
		
		
		
		
		
	}

}
