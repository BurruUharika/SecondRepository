package launcher;

public class test extends basetest
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		  		get()
				getCurrentUrl()
				getTitle()
				getPagesource()
				close()
				quit()
				manage()
				navigate()
				
				getWindoWHandle()
				getWindoWHandles()
				findElement()
				findElements()
				sWtichTo()
		 */
		
		
		launch("chrome");
		
		navigateurl("https://www.amazon.com/");
		
		navigateurl("https://www.tcs.com/");
		
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String page = driver.getPageSource();
		System.out.println(page);
		
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		 driver.manage().window().fullscreen();
		 
		 driver.navigate().forward();
			
			Thread.sleep(5000);
			
			driver.navigate().refresh();
			
		
			
			
			
			
		
	
		
	}

}
