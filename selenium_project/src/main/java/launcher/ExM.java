package launcher;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ExM extends basetest
{
	private final static Logger log = java.util.logging.Logger.getAnonymousLogger();
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("init the properties files....");
		
		launch("chromebrowser");
		log.info("Opened the Browser : " +  ((Object) getP()).getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		org.testng.log4testng.Logger.info("Opened the application : " + ((Object) getChildProp()).getProperty("amazonurl"));
		
		selectDropdownOption("amazonsearchdropbox_id","Books");
		log.info("select Dropdown Option By using locator : " + ((Object) getChildProp()).getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Entered the searc text By using locator : " + ((Object) getChildProp()).getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element By using locator :" + ((Object) getChildProp()).getProperty("amazonsearchbutton_xpath"));
		
		
		WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		loc.sendKeys("Books");
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys(Keys.ENTER);
	}

	private static void clickElement(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void typeText(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void navigateurl(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void selectDropdownOption(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static Object getChildProp() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object getP() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void launch(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void init() {
		// TODO Auto-generated method stub
		
	}

	
}

