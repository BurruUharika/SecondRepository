package launcher;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class datefield {

	private static final String Day_OF_MONTH = null;
	static int targetDay=0,targetMonth=0,targetYear=0;
	static int currentDay=0,currentMonth=0,currentYear=0;
	static int jumpToMonth=0;
	static boolean increment=true;
	private static Object MONTH;
	private static Object YEAR;
	private static Object webDriverManger;
	private static Object dat;
	public static void main(String[] args) {
	
		String dateToSet= "20/04/2025";
		getCurrentDateMonthAndYear();
		System.out.println(currentDay+" " + currentMonth + " "+ currentYear);
		getTargetDteMonthAndyear(dateToSet);
		getCurrentDateMonthAndYear();
		calculateHowMonthsToJump();
		System.out.println(jumpToMonth);
		
		
		
		 WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.switchTo().webdriver.findElement(By.xpath("//*[@id=\"onwardCal\"]"));
		driver.findElements("//*[@id=\"onwardCal\"]").click();
		
		for(int i=0;i<jumpToMonth;i++) {
			if(increment) {
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/text[2]")).click();
	}
	
			else
			{
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/text[2]")).click();
			}
				Thread.sleep(1000);
			}
			driver.findElement(By.LinkText(Integer.toString(targetDay))).click();
			}
	
	
	public static void calculateHowMonthsToJump()
	{
		
		if((targetMonth-currentMonth)>0)
		
		jumpToMonth= targetMonth-currentMonth;
		}
	 
	else{
		jumpToMonth=targetMonth-currentMonth;
		increment = false;
		
	}
	
}


public static void getTargetDteMonthAndyear(String dateToSet) {
		// TODO Auto-generated method stub
		
	}



	public static void getTargetDateMonthAndYear(String dateToSet)
	{
	int firstIndex = dateToSet.indexOf("/");
	int lastIndex = dateToSet.lastIndexOf("/");
	String day = dateToSet.substring(0,firstIndex);
	String month = dateToSet.substring(firstIndex+1, lastIndex);
	String year = dateToSet.substring(lastIndex, dateToSet.length());
	targetDay= Integer.parseInt(day);
	targetMonth=Integer.parseInt(month);
	targetYear=Integer.parseInt(year);
	}
		
		
		
		
		
		
	public static void getCurrentDateMonthAndYear()
	{
		
	  dat = datefield.getInstance();
	currentDay= (int) (( dat).get(datefield.Day_OF_MONTH);
	currentMonth=( (Duration) dat).get(datefield.MONTH)+1;
	currentYear=( (Duration) dat).get(datefield.YEAR);
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


	private static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
