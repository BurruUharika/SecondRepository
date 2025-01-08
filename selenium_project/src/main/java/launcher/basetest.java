package launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class basetest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectResourcePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	
	public static void init() throws Exception
	{
		
		fis = new FileInputStream(projectResourcePath+"data.properties");
		p = new Properties();
		p.load(fis);
		//String e = p.getProperty("amazonurl");
		//System.out.println(e);
		fis = new FileInputStream(projectResourcePath+"envirnment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		fis = new FileInputStream(projectResourcePath+e+".properties");
		Properties childprop = new Properties();
		childprop.load(fis);
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
		
		
	}
	
	
	
	
	public static void launch(String browser)
	{
	if( p.getProperty(browser).equalsIgnoreCase("chrome"))	{
		driver = new ChromeDriver();	
		
	}else if (p.getProperty(browser).equals("firefox")) {
		driver = new FirefoxDriver();
			
	}else if(p.getProperty(browser).equals("edge")) {
		driver = new EdgeDriver();
	}
	}
	
	public static void navigateurl(String url)
	{
		//driver.get(url);
		driver.navigate().to(p.getProperty(url));
		
	}


}






